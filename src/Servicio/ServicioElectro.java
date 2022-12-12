package Servicio;

import Entidad.Electrodomestico;
import java.util.Scanner;

public class ServicioElectro {

    Scanner leer = new Scanner(System.in);
//    Electrodomestico e = new Electrodomestico();

    private char comprobarConsumoEnergetico(char consumo) {

        if (Character.toUpperCase(consumo) != 'A' && Character.toUpperCase(consumo) != 'B' && Character.toUpperCase(consumo) != 'C' && Character.toUpperCase(consumo) != 'D' && Character.toUpperCase(consumo) != 'E' && Character.toUpperCase(consumo) != 'F') {
            consumo = 'F';
        }
        return consumo;
    }

    private String comprobarColor(String color) {

        if (!color.equalsIgnoreCase("blanco") || !color.equalsIgnoreCase("negro") || !color.equalsIgnoreCase("rojo") || !color.equalsIgnoreCase("azul") || !color.equalsIgnoreCase("gris")) {
            color = "Blanco";
        }
        return color;
    }

    public Electrodomestico crearElectrodomestico(Electrodomestico e) {

        System.out.println("Ingrese el color");
        e.setColor(leer.next());
        System.out.println("Ingerese el tipo de consumo (A,B,C,D,E,F)");
        e.setConsumo(leer.next().charAt(0));
        System.out.println("Ingrese el peso");
        e.setPeso(leer.nextDouble());
        e.setPrecio(1000.00);

        e.setConsumo(comprobarConsumoEnergetico(e.getConsumo()));
        e.setColor(comprobarColor(e.getColor()));

        return e;

    }
}
