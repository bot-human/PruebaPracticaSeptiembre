package com.corenetworks.PruebaP.modeloPrueba2;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "socios")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Patrones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dni;

    @Column(nullable = false)
    private int hrsnavegadas;
    @Column(nullable = false)
    private String carnet;
    @Column(nullable = false)
    private String titulo;

}
