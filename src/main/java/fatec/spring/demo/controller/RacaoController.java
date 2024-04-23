package fatec.spring.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fatec.spring.demo.entity.Racao;
import fatec.spring.demo.records.DadosCadastroRacao;
import fatec.spring.demo.records.DadosConsultaRacao;
import fatec.spring.demo.service.RacaoService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("racao")
public class RacaoController {
    
    @Autowired
    RacaoService service;

    @GetMapping
    public List<Racao> listar() {
        return service.listarTodos();
    }

    @PostMapping
    public void criar(@RequestBody @Valid DadosCadastroRacao dados) {
        service.criar(dados);
    }

    @GetMapping("/consulta")
    public List<Racao> listarConsulta(@RequestBody @Valid DadosConsultaRacao dados) {
        return service.listarComFiltro(dados.estoque(), dados.ultimacompra());
    }

}
