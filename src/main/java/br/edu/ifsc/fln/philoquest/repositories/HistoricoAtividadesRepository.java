package br.edu.ifsc.fln.philoquest.repositories;

import br.edu.ifsc.fln.philoquest.modelos.HistoricoAtividades;
import br.edu.ifsc.fln.philoquest.modelos.enums.TipoAtividadeHistorico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HistoricoAtividadesRepository extends JpaRepository<HistoricoAtividades, Long> {
    List<HistoricoAtividades> findByTipoAtividade(TipoAtividadeHistorico tipoAtividade);
    List<HistoricoAtividades> findAllByOrderByDataDesc();
}
