package com.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name = "cliente")
@Getter
@Setter
public class Cuenta {
    @Id
    private int id;
    private String numero;
    private String tipo;
    @ManyToOne
    @JoinColumn(name ="cliente_id", referencedColumnName = "id")
    private Cliente cliente;
}
