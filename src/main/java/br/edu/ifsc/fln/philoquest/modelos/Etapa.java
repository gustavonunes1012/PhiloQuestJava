package br.edu.ifsc.fln.philoquest.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Etapa {
    @Id
    private int numeroEtapa;
    private String titulo;
    private String descricao;
}
