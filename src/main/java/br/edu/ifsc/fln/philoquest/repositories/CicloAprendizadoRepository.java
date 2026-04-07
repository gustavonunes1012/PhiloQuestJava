package br.edu.ifsc.fln.philoquest.repositories;

import br.edu.ifsc.fln.philoquest.modelos.CicloAprendizado;
import br.edu.ifsc.fln.philoquest.modelos.Professor;
import br.edu.ifsc.fln.philoquest.modelos.enums.TipoCiclo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CicloAprendizadoRepository extends JpaRepository<CicloAprendizado, Long> {
    List<CicloAprendizado> findByTipo(TipoCiclo tipo);
    List<CicloAprendizado> findByCriador(Professor criador);
}
