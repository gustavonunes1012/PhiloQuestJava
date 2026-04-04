package br.edu.ifsc.fln.philoquest.modelos;

import java.util.Date;

import br.edu.ifsc.fln.philoquest.modelos.enums.*;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumeratedValue;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class SubmissaoEtapa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String conteudo;
    private String urlAnexo;
    private Date dataEnvio;
    @EnumeratedValue
    private StatusSubmissao status;
    private Double nota;
    private String feedback;
    private Integer xpGanho;
    @OneToOne
    private Etapa etapa;
}
