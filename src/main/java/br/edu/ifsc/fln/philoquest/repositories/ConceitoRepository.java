package br.edu.ifsc.fln.philoquest.repositories;

import br.edu.ifsc.fln.philoquest.modelos.Conceito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ConceitoRepository extends JpaRepository<Conceito, Long> {
    Optional<Conceito> findByTermo(String termo);
}
