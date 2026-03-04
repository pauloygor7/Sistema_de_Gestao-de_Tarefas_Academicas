package com.sga.backend.service;

import com.sga.backend.model.Disciplina;
import com.sga.backend.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DisciplinaService {

    @Autowired
    DisciplinaRepository disciplinaRepository;

    @Transactional(readOnly = true)
    public List<Disciplina> listarDisciplinas() {
        List<Disciplina> lista = disciplinaRepository.findAll();
        return lista;
    }
}
