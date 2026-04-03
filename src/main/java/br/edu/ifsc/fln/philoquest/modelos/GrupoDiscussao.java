package br.edu.ifsc.fln.philoquest.modelos;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class GrupoDiscussao {
    private String titulo;
    private String topico;
    private Turma turma;
    
    public void postarMensagem(String msg, Aluno autor) {}
}
