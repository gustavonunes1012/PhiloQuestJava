package br.edu.ifsc.fln.philoquest.repositories;

import br.edu.ifsc.fln.philoquest.modelos.ProgressoCiclo;
import br.edu.ifsc.fln.philoquest.modelos.enums.StatusCiclo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProgressoCicloRepository extends JpaRepository<ProgressoCiclo, Long> {
    List<ProgressoCiclo> findByStatus(StatusCiclo status);
}
