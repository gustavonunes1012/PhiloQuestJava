package br.edu.ifsc.fln.philoquest.modelos;

import br.edu.ifsc.fln.philoquest.modelos.enums.*;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Professor  extends Usuario{
@Override
public boolean login(String matricula, String senha) {
    return false;
}

@Override
public void logout() {}

@Override
public void atualizarPerfil() {}

public void validarSubmissao(SubmissaoEtapa submissao, StatusSubmissao status, Double nota, String feedback) {}
public void criarCiclo(CicloAprendizado ciclo) {
    
}

public void criarMissao(Missao missao) {
    
}

public void criarTurma(Turma turma) {
    
}
    public Professor(String matricula, String nome, String senha) {
        super(matricula, nome, senha);
    }

    
}
