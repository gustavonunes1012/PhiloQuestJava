package br.edu.ifsc.fln.philoquest.modelos;

import java.util.Date;

import br.edu.ifsc.fln.philoquest.modelos.enums.*;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class HistoricoAtividades {
    private String descricao;
    private int xpGanho;
    private TipoAtividadeHistorico tipoAtividade;
    private Date data;
}
