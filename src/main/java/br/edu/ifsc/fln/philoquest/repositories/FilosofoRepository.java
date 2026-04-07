package br.edu.ifsc.fln.philoquest.repositories;

import br.edu.ifsc.fln.philoquest.modelos.Filosofo;
import br.edu.ifsc.fln.philoquest.modelos.enums.EpocaFilosofo;
import br.edu.ifsc.fln.philoquest.modelos.enums.RaridadeFilosofo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FilosofoRepository extends JpaRepository<Filosofo, Long> {
    Optional<Filosofo> findByNome(String nome);
    List<Filosofo> findByEpoca(EpocaFilosofo epoca);
    List<Filosofo> findByRaridade(RaridadeFilosofo raridade);
}
