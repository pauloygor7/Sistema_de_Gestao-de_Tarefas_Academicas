package com.sga.backend.controller;

import com.sga.backend.model.Disciplina;
import com.sga.backend.repository.DisciplinaRepository;
import com.sga.backend.service.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/disciplina")
public class DisciplinaController {

    @Autowired
    DisciplinaService disciplinaService;

    @GetMapping
    public List<Disciplina> listar() {
        List<Disciplina> lista = disciplinaService.listarDisciplinas();
        return lista;
    }
}
