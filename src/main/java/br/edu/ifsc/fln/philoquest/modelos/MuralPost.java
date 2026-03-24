package br.edu.ifsc.fln.philoquest.modelos;

import java.util.Date;
import java.util.List;

import br.edu.ifsc.fln.philoquest.modelos.enums.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MuralPost {
    private String titulo;
    private String descricao;
    private Date dataPostagem;
    private TipoPostMural tipoPost;
    private Aluno autor;
    private List<Aluno> curtidas;
    
    public void adicionarCurtida(Aluno aluno) {}
    public void removerCurtida(Aluno aluno) {}
}
