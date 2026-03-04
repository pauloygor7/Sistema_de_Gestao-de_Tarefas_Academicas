package com.sga.backend.dto;

public record UsuarioRequestDTO (
        String nome,
        String email,
        String senha
) {}
