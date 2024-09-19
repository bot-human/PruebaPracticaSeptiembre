package com.corenetworks.PruebaP.modeloPrueba2;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "barcos")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Barcos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSocio;

    @Column(nullable = false)
    private int matricula;
    @Column(length = 120, nullable = false)
    private String nombre;
    @Column(nullable = false)
    private boolean amarre;
    @Column(nullable = false)
    private int cuota;

    @ManyToOne
    @JoinColumn(name = "id_Socio",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_barcos_personas"))
    private Persona p1;


}
