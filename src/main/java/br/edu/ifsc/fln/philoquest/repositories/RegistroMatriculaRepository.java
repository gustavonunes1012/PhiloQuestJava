package br.edu.ifsc.fln.philoquest.repositories;

import br.edu.ifsc.fln.philoquest.modelos.RegistroMatricula;
import br.edu.ifsc.fln.philoquest.modelos.enums.StatusMatricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegistroMatriculaRepository extends JpaRepository<RegistroMatricula, String> {
    List<RegistroMatricula> findByStatus(StatusMatricula status);
}
