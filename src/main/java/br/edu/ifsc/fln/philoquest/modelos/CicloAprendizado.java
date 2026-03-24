package br.edu.ifsc.fln.philoquest.modelos;

import java.util.List;

import br.edu.ifsc.fln.philoquest.modelos.enums.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CicloAprendizado {
    private String titulo;
    private String descricao;
    private TipoCiclo tipo;
    private Professor criador;
    private List<Etapa> etapas;
}
