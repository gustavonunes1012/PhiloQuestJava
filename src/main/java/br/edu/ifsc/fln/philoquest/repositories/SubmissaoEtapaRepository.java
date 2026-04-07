package br.edu.ifsc.fln.philoquest.repositories;

import br.edu.ifsc.fln.philoquest.modelos.Etapa;
import br.edu.ifsc.fln.philoquest.modelos.SubmissaoEtapa;
import br.edu.ifsc.fln.philoquest.modelos.enums.StatusSubmissao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubmissaoEtapaRepository extends JpaRepository<SubmissaoEtapa, Long> {
    List<SubmissaoEtapa> findByStatus(StatusSubmissao status);
    List<SubmissaoEtapa> findByEtapa(Etapa etapa);
}
