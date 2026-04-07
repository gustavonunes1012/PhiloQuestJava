package br.edu.ifsc.fln.philoquest.repositories;

import br.edu.ifsc.fln.philoquest.modelos.ProgressoMissao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProgressoMissaoRepository extends JpaRepository<ProgressoMissao, Long> {
    List<ProgressoMissao> findByConcluida(boolean concluida);
}
