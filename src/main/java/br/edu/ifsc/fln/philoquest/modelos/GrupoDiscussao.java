package br.edu.ifsc.fln.philoquest.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
y

@Getter
@Setter
@Entity
public class GrupoDiscussao {
    @Id
    private long id;
    private String titulo;
    private String topico;
    @ManyToOne
    private Turma turma;
    
    public void postarMensagem(String msg, Aluno autor) {}
}
