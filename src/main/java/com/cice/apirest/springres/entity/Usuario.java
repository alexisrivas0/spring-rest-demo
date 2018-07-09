package com.cice.apirest.springres.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
@Data //hace los getter y setter pertence a lombok
public class Usuario {

    @Id
    private String id;
    private String nombre;
    private String apellidos;
    private String email;

}
