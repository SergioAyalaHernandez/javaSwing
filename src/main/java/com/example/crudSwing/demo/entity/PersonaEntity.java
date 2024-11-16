package com.example.crudSwing.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "persona")
public class PersonaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPersona;

    @Column(nullable = false, length = 65)
    private String nombres;

    @Column(nullable = false, length = 65)
    private String apellidos;

    @Column(nullable = false, length = 100)
    private String email;

    @Column(nullable = false, length = 100)
    private String cedula;

    @Column(nullable = false, length = 20)
    private String celular;

    @Column(name = "fecha_creacion", nullable = true, updatable = true)
    private LocalDate fechaCreacion;
}
