package br.edu.ifsc.fln.philoquest.modelos;

import br.edu.ifsc.fln.philoquest.modelos.enums.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Filosofo {
    private String nome;
    private String descricao;
    private EpocaFilosofo epoca;
    private RaridadeFilosofo raridade;
}
