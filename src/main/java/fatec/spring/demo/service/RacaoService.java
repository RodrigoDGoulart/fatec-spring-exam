package fatec.spring.demo.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fatec.spring.demo.entity.Racao;
import fatec.spring.demo.records.DadosCadastroRacao;
import fatec.spring.demo.repository.RacaoRepository;

@Service
public class RacaoService {
    
    @Autowired
    RacaoRepository repository;

    public void criar(DadosCadastroRacao dados) {
        if (dados.ultimacompra() == null) {
            repository.save(new Racao(
                dados.nome(),
                LocalDateTime.now(),
                dados.estoque(),
                dados.avaliacao()
            ));
        } else {
            repository.save(new Racao(dados));
        }
    }

    public List<Racao> listarTodos () {
        return repository.findAll();
    }

    public List<Racao> listarComFiltro (Float estoque, LocalDateTime ultimacompra) {
        return repository.findAllByEstoqueLessThanOrUltimacompraLessThan(estoque, ultimacompra);
    }

}
