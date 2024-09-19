package com.corenetworks.PruebaP.modeloPrueba2;

import jakarta.persistence.Embeddable;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Embeddable

public class ViajarPK {
    @ManyToOne
    @JoinColumn(name = "id_socio", nullable = false,
            foreignKey = @ForeignKey(name = "FK_ap_barcos"))
    private Socios socios;

    @ManyToOne
    @JoinColumn(name = "id_dni", nullable = false,
            foreignKey = @ForeignKey(name = "FK_ap_patrones"))
    private Patrones patrones;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ViajarPK that = (ViajarPK) o;
        return Objects.equals(socios, that.socios) &&
                Objects.equals(patrones, that.patrones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(socios, patrones);
    }
}
