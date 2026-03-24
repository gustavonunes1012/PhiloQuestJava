package br.edu.ifsc.fln.philoquest.modelos;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProgressoMissao {
    private boolean concluida;
    private Date dataConclusao;
    
    public void verificarConclusao() {}
}
