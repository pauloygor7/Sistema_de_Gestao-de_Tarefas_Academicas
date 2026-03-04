package com.sga.backend.dto;

public record DisciplinaResponseDTO (
        Long id,
        String nome,
        String descricao,
        Long usuarioId
) {}
