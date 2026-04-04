package br.edu.ifsc.fln.philoquest.modelos;

import java.util.List;

import br.edu.ifsc.fln.philoquest.modelos.enums.*;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumeratedValue;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
    @EnumeratedValue
    private TipoCiclo tipo;
    @OneToOne
    private Professor criador;
    @OneToMany(mappedBy = "cicloAprendizado", cascade = CascadeType.ALL)
    private List<Etapa> etapas;

}
