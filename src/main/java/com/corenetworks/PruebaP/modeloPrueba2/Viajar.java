package com.corenetworks.PruebaP.modeloPrueba2;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="patrones_barcos")
@IdClass(ViajarPK.class)

public class Viajar {
    @Id
    private Barcos barcos;
    @Id
    private Patrones patrones;

    @Column(length=60, nullable = false)
    private String destino;
    @Column(length = 120, nullable = false)
    private LocalDate fSalida;
    @Column
    private int hSalida;

}
