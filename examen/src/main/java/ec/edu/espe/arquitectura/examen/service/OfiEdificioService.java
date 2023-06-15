package ec.edu.espe.arquitectura.examen.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import ec.edu.espe.arquitectura.examen.model.OfiEdificio;
import ec.edu.espe.arquitectura.examen.repository.OfiEdificioRepository;
import jakarta.transaction.Transactional;

public class OfiEdificioService {

    private final OfiEdificioRepository ofiEdificioRepository;

    public OfiEdificioService(OfiEdificioRepository ofiEdificioRepository) {
        this.ofiEdificioRepository = ofiEdificioRepository;
    }

    public Optional<OfiEdificio> obtainByCode(String code) {
        return this.ofiEdificioRepository.findById(code);
    }

    @Transactional
    public OfiEdificio create(OfiEdificio ofiEdificio) {
        Optional<OfiEdificio> ofiTmp = this.ofiEdificioRepository.findById(ofiEdificio.getPk());
        if (ofiTmp == null) {
            return this.ofiEdificioRepository.save(ofiEdificio);
        } else {
            throw new RuntimeException("Edificio ya existe");
        }
    }

}
