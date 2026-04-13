package br.edu.ifsc.fln.philoquest.services;

import br.edu.ifsc.fln.philoquest.modelos.Aluno;
import br.edu.ifsc.fln.philoquest.modelos.Turma;
import br.edu.ifsc.fln.philoquest.modelos.enums.NivelAluno;
import br.edu.ifsc.fln.philoquest.repositories.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    private final AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public List<Aluno> listarTodos() {
        return alunoRepository.findAll();
    }

    public Optional<Aluno> buscarPorMatricula(String matricula) {
        return alunoRepository.findById(matricula);
    }

    public Aluno salvar(Aluno aluno) {
        if (aluno.getNivel() == null) {
            aluno.setNivel(NivelAluno.INICIANTE);
        }
        return alunoRepository.save(aluno);
    }

    public Aluno atualizar(String matricula, Aluno alunoAtualizado) {
        Aluno aluno = alunoRepository.findById(matricula)
                .orElseThrow(() -> new RuntimeException("Aluno não encontrado com matrícula: " + matricula));

        aluno.setNome(alunoAtualizado.getNome());
        aluno.setSenha(alunoAtualizado.getSenha());
        aluno.setXpTotal(alunoAtualizado.getXpTotal());
        aluno.setNivel(alunoAtualizado.getNivel());
        aluno.setTurma(alunoAtualizado.getTurma());

        return alunoRepository.save(aluno);
    }

    public void deletar(String matricula) {
        if (!alunoRepository.existsById(matricula)) {
            throw new RuntimeException("Aluno não encontrado com matrícula: " + matricula);
        }
        alunoRepository.deleteById(matricula);
    }

    public List<Aluno> listarPorTurma(Turma turma) {
        return alunoRepository.findByTurma(turma);
    }

    public List<Aluno> listarPorNivel(NivelAluno nivel) {
        return alunoRepository.findByNivel(nivel);
    }

    public Aluno adicionarXp(String matricula, int xp) {
        Aluno aluno = alunoRepository.findById(matricula)
                .orElseThrow(() -> new RuntimeException("Aluno não encontrado com matrícula: " + matricula));

        aluno.setXpTotal(aluno.getXpTotal() + xp);
        return alunoRepository.save(aluno);
    }
}
