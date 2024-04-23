package fatec.spring.demo.records;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroRacao (
    @NotBlank String nome,
    LocalDateTime ultimacompra,
    @NotNull Float estoque,
    Integer avaliacao
) {
}
