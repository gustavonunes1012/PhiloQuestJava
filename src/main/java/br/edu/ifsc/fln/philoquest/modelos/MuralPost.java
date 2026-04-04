package br.edu.ifsc.fln.philoquest.modelos;

import java.util.Date;
import java.util.List;

import org.hibernate.annotations.ManyToAny;

import br.edu.ifsc.fln.philoquest.modelos.enums.*;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumeratedValue;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class MuralPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String titulo;
    private String descricao;
    private Date dataPostagem;
    @EnumeratedValue
    private TipoPostMural tipoPost;
    @ManyToAny
    private Aluno autor;
    @OneToMany
    private List<Curtida> curtidas;
    
    public void adicionarCurtida(Curtida curtida) {}
    public void removerCurtida(Curtida curtida) {}
}
