package br.edu.ifsc.fln.philoquest.modelos;

import java.util.Date;

import br.edu.ifsc.fln.philoquest.modelos.enums.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegistroMatricula {
    private String matricula;
    private StatusMatricula status;
    private Date dataImportacao;
}
