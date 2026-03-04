package com.sga.backend.dto;

import java.time.LocalDate;

public record TarefaRequestDTO (
        String titulo,
        String descricao,
        LocalDate prazo,
        String prioridade,
        String status,
        Long disciplinaId
) {}
