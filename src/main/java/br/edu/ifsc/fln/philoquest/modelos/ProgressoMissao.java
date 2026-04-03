package br.edu.ifsc.fln.philoquest.modelos;

import java.util.Date;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ProgressoMissao {
    private boolean concluida;
    private Date dataConclusao;
    
    public void verificarConclusao() {}
}
