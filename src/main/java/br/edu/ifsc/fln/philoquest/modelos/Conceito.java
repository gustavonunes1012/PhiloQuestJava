package br.edu.ifsc.fln.philoquest.modelos;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Conceito {
    private String termo;
    private String definicao;
    private String imagemUrl;
}
