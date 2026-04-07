package br.edu.ifsc.fln.philoquest.repositories;

import br.edu.ifsc.fln.philoquest.modelos.Missao;
import br.edu.ifsc.fln.philoquest.modelos.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface MissaoRepository extends JpaRepository<Missao, Long> {
    List<Missao> findByCriador(Professor criador);
    List<Missao> findByDataLimiteAfter(Date data);
    List<Missao> findByDataLimiteBefore(Date data);
}
