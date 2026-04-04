package br.edu.ifsc.fln.philoquest.modelos;

import java.util.List;

import br.edu.ifsc.fln.philoquest.modelos.enums.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@PrimaryKeyJoinColumn(name = "matricula")
public class Aluno extends Usuario{
private int xpTotal;
private NivelAluno nivel;
private Turma turma;
private List<Object> colecao;

public Aluno(String matricula, String nome, String senha) {
    super(matricula, nome, senha);
}

@Override
public boolean login(String matricula, String senha) {
    return false;
}

@Override
public void logout() {}

@Override
public void atualizarPerfil() {}

public void enviarSubmissao(Etapa etapa, String conteudo) {}

public void postarNoMural(String texto) {}

public void curtirPost(MuralPost post) {}

public void visualizarColecao() {}

}
