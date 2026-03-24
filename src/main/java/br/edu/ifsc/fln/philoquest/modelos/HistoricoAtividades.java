package br.edu.ifsc.fln.philoquest.modelos;

import java.util.Date;

import br.edu.ifsc.fln.philoquest.modelos.enums.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HistoricoAtividades {
    private String descricao;
    private int xpGanho;
    private TipoAtividadeHistorico tipoAtividade;
    private Date data;
}
