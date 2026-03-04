package com.sga.backend.dto;

public record DisciplinaRequestDTO (
        String nome,
        String descricao,
        Long usuarioId
) {}
