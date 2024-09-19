package com.corenetworks.PruebaP.modeloPrueba1;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ivaGeneral implements IImpuesto {

    @Override
    public double calcularImpuesto(Producto producto) {
        return producto.getPrecio() * 0.21;
    }
}
