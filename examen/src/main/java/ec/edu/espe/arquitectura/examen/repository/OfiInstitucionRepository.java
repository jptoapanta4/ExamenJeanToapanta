package ec.edu.espe.arquitectura.examen.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import ec.edu.espe.arquitectura.examen.model.OfiInstitucion;
import ec.edu.espe.arquitectura.examen.model.OfiSede;

public interface OfiInstitucionRepository extends JpaRepository<OfiInstitucion, Integer> {
    List<OfiSede> findByCodigoInstitucion(Integer codigoInstitucion);
}
