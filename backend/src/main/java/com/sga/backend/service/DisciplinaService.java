package com.sga.backend.service;

import com.sga.backend.dto.DisciplinaResponseDTO;
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
    public List<DisciplinaResponseDTO> listarDisciplinas() {
        return disciplinaRepository.findAll()
        .stream()
                .map(disciplina -> new DisciplinaResponseDTO(
                        disciplina.getId(),
                        disciplina.getNome(),
                        disciplina.getDescricao(),
                        disciplina.getUsuario().getId()
                ))
                .toList();
    }
}
