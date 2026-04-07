package br.edu.ifsc.fln.philoquest.repositories;

import br.edu.ifsc.fln.philoquest.modelos.Aluno;
import br.edu.ifsc.fln.philoquest.modelos.MuralPost;
import br.edu.ifsc.fln.philoquest.modelos.enums.TipoPostMural;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MuralPostRepository extends JpaRepository<MuralPost, Long> {
    List<MuralPost> findByAutor(Aluno autor);
    List<MuralPost> findByTipoPost(TipoPostMural tipoPost);
    List<MuralPost> findAllByOrderByDataPostagemDesc();
}
