package br.edu.ifsc.fln.philoquest.modelos;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Turma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
private String nomeDaTurma;
private String codigoTurma;
@ManyToOne
private Professor professor;
@OneToMany(mappedBy = "turma")
private List<Aluno> alunos;

public void adicionarAluno (Aluno aluno){}
public void removerAluno(Aluno aluno) {}
public double obterMediaGeral () {
    return 0.0;
}

@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((nomeDaTurma == null) ? 0 : nomeDaTurma.hashCode());
    result = prime * result + ((codigoTurma == null) ? 0 : codigoTurma.hashCode());
    result = prime * result + ((professor == null) ? 0 : professor.hashCode());
    result = prime * result + ((alunos == null) ? 0 : alunos.hashCode());
    return result;
}
@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Turma other = (Turma) obj;
    if (nomeDaTurma == null) {
        if (other.nomeDaTurma != null)
            return false;
    } else if (!nomeDaTurma.equals(other.nomeDaTurma))
        return false;
    if (codigoTurma == null) {
        if (other.codigoTurma != null)
            return false;
    } else if (!codigoTurma.equals(other.codigoTurma))
        return false;
    if (professor == null) {
        if (other.professor != null)
            return false;
    } else if (!professor.equals(other.professor))
        return false;
    if (alunos == null) {
        if (other.alunos != null)
            return false;
    } else if (!alunos.equals(other.alunos))
        return false;
    return true;
}
public Turma(String nomeDaTurma, String codigoTurma, Professor professor) {
    this.nomeDaTurma = nomeDaTurma;
    this.codigoTurma = codigoTurma;
    this.professor = professor;
    this.alunos = new ArrayList<>();
}


}
