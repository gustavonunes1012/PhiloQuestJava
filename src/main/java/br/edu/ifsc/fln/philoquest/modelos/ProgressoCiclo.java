package br.edu.ifsc.fln.philoquest.modelos;

import java.util.Date;
import java.util.List;

import br.edu.ifsc.fln.philoquest.modelos.enums.*;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ProgressoCiclo {
    private StatusCiclo status;
    private Date dataInicio;
    private Date dataConclusao;
    private List<SubmissaoEtapa> submissoes;
}
