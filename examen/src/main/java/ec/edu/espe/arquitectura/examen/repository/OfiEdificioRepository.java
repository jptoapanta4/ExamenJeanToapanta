package ec.edu.espe.arquitectura.examen.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.espe.arquitectura.examen.model.OfiEdificio;
import ec.edu.espe.arquitectura.examen.model.OfiEdificioPK;

public interface OfiEdificioRepository extends JpaRepository<OfiEdificio, Integer> {

    List<OfiEdificio> findByCodigoInstitucion(Integer codigoInstitucion);

    List<OfiEdificio> findByCodigoInstitucionOrderBySuperficie(Integer codigoInstitucion);

    Optional<OfiEdificio> findById(OfiEdificioPK pk);
}