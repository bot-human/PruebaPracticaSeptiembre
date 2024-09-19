package com.corenetworks.PruebaP.modeloPrueba1;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Factura {
    @Autowired
    private IImpuesto impuesto;

    List<Producto> productos;

    public double calcularTotalFactura(){
        return productos.stream().
                mapToDouble( productos-> productos.getPrecio()+impuesto.
                        calcularImpuesto(productos)).sum();
    }
}
