package com.corenetworks.PruebaP.presentacion;

import com.corenetworks.PruebaP.modeloPrueba1.Factura;
import com.corenetworks.PruebaP.modeloPrueba1.Producto;
import com.corenetworks.PruebaP.modeloPrueba1.ivaGeneral;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class PruebaPApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PruebaPApplication.class, args);
	}


	Producto p1 = new Producto("Ordenador",1.250);
	Producto p2 = new Producto("televison",1.180);

	Factura facturaGeneral = new Factura(new ivaGeneral(), Arrays.asList(p1,p2));

	@Override
	public void run(String... args) throws Exception {
		System.out.println(facturaGeneral.calcularTotalFactura());
	}
}
