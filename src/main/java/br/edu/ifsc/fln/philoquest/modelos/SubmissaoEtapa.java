package br.edu.ifsc.fln.philoquest.modelos;

import java.util.Date;

import br.edu.ifsc.fln.philoquest.modelos.enums.*;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class SubmissaoEtapa {
    private String conteudo;
    private String urlAnexo;
    private Date dataEnvio;
    private StatusSubmissao status;
    private Double nota;
    private String feedback;
    private Integer xpGanho;
    private Etapa etapa;
}
