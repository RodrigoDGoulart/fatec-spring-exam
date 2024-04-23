package fatec.spring.demo.entity;

import java.time.LocalDateTime;

import fatec.spring.demo.records.DadosCadastroRacao;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "rac_racao")
@Entity(name = "Racao")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Racao {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rac_id")
    private Long id;

    @Column(name = "rac_nome")
    private String nome;

    @Column(name = "rac_data_hora_ultima_compra")
    LocalDateTime ultimacompra;

    @Column(name = "rac_estoque")
    Float estoque;

    @Column(name = "rac_avaliacao")
    Integer avaliacao;

    public Racao (DadosCadastroRacao dados) {
        this.nome = dados.nome();
        this.ultimacompra = dados.ultimacompra();
        this.estoque = dados.estoque();
        this.avaliacao = dados.avaliacao();
    }

    public Racao (String nome, LocalDateTime ultimacompra, Float estoque, Integer avaliacao) {
        this.nome = nome;
        this.ultimacompra = ultimacompra;
        this.estoque = estoque;
        this.avaliacao = avaliacao;
    }
    
}
