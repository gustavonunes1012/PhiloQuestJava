package br.edu.ifsc.fln.philoquest.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Conceito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String termo;
    private String definicao;
    private String imagemUrl;
}
