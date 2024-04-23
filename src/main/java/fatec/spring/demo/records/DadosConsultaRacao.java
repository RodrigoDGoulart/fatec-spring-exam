package fatec.spring.demo.records;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotNull;

public record DadosConsultaRacao (
    @NotNull LocalDateTime ultimacompra,
    @NotNull Float estoque
) {}
