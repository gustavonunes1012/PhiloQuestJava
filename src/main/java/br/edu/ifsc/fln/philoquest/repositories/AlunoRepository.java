package br.edu.ifsc.fln.philoquest.repositories;

import br.edu.ifsc.fln.philoquest.modelos.Aluno;
import br.edu.ifsc.fln.philoquest.modelos.Turma;
import br.edu.ifsc.fln.philoquest.modelos.enums.NivelAluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, String> {
    List<Aluno> findByTurma(Turma turma);
    List<Aluno> findByNivel(NivelAluno nivel);
    List<Aluno> findByXpTotalGreaterThan(int xpTotal);
}
