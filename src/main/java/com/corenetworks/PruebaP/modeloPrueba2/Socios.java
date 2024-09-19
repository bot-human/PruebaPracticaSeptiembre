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


public class Socios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSocio;

    @Column(length=10, nullable = false)
    private String dni;
}
