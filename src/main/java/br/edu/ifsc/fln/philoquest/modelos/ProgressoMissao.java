package br.edu.ifsc.fln.philoquest.modelos;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ProgressoMissao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private boolean concluida;
    private Date dataConclusao;
    
    public void verificarConclusao() {}
}
