package com.corenetworks.PruebaP.modeloPrueba2;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "personas")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDni;

    @Column(length=120, nullable = false)
    private String nombre;
    @Column(length = 120, nullable = false)
    private String direccion;
    @Column
    private String asociado;

    @OneToMany(mappedBy = "p1",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.EAGER)

    List<Barcos> barcos;


}
