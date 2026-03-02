package com.sga.backend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "tb_tarefa")
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String titulo;
    String descricao;
    Date prazo;
    String prioridade;
    String status;

    @ManyToOne
    Disciplina disciplina;
}
