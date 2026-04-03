package br.edu.ifsc.fln.philoquest.modelos;

import java.util.Date;

import br.edu.ifsc.fln.philoquest.modelos.enums.*;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class RegistroMatricula {
    private String matricula;
    private StatusMatricula status;
    private Date dataImportacao;
}
