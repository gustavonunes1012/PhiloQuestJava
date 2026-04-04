package br.edu.ifsc.fln.philoquest.modelos;

import java.util.Date;
import java.util.List;

import org.hibernate.annotations.ManyToAny;

import br.edu.ifsc.fln.philoquest.modelos.enums.*;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumeratedValue;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ProgressoCiclo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @EnumeratedValue
    private StatusCiclo status;
    private Date dataInicio;
    private Date dataConclusao;
    @ManyToAny
    private List<SubmissaoEtapa> submissoes;
}
