package br.edu.ifsc.fln.philoquest.modelos;

import java.util.Date;

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
public class HistoricoAtividades {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String descricao;
    private int xpGanho;
    @EnumeratedValue
    private TipoAtividadeHistorico tipoAtividade;
    private Date data;
}
