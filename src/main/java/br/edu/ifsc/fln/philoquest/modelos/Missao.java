package br.edu.ifsc.fln.philoquest.modelos;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Missao {
    private String titulo;
    private String descricao;
    private int xpRecompensa;
    private Date dataLimite;
    private Professor criador;
}
