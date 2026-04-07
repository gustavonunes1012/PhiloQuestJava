package br.edu.ifsc.fln.philoquest.modelos;

import java.util.List;

import br.edu.ifsc.fln.philoquest.modelos.enums.*;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class CicloAprendizado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String titulo;

    private String descricao;
    @Enumerated(EnumType.STRING)
    private TipoCiclo tipo;
    @ManyToOne
    private Professor criador;
    @OneToMany(mappedBy = "cicloAprendizado", cascade = CascadeType.ALL)
    private List<Etapa> etapas;

}
