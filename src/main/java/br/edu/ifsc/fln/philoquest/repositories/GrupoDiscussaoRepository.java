package br.edu.ifsc.fln.philoquest.repositories;

import br.edu.ifsc.fln.philoquest.modelos.GrupoDiscussao;
import br.edu.ifsc.fln.philoquest.modelos.Turma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GrupoDiscussaoRepository extends JpaRepository<GrupoDiscussao, Long> {
    List<GrupoDiscussao> findByTurma(Turma turma);
}
