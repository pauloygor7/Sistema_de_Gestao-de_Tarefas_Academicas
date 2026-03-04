package com.sga.backend.dto;

import java.time.LocalDate;

public record TarefaResponseDTO(
        Long id,
        String titulo,
        String descricao,
        LocalDate prazo,
        String prioridade,
        String status
) {}
