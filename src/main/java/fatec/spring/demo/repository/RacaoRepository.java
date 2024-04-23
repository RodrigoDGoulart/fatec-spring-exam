package fatec.spring.demo.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fatec.spring.demo.entity.Racao;

public interface RacaoRepository extends JpaRepository<Racao, Long>{
    List<Racao> findAllByEstoqueLessThanOrUltimacompraLessThan(Float estoque, LocalDateTime ultimacompra);
} 
