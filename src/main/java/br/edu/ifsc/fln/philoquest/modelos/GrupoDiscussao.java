package br.edu.ifsc.fln.philoquest.modelos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GrupoDiscussao {
    private String titulo;
    private String topico;
    private Turma turma;
    
    public void postarMensagem(String msg, Aluno autor) {}
}
