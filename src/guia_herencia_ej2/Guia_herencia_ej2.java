package guia_herencia_ej2;

import Entidad.Electrodomestico;
import Servicio.ServicioLavadora;
import Servicio.ServicioTelevisor;
import java.util.ArrayList;
import java.util.Scanner;

public class Guia_herencia_ej2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        ServicioLavadora sl = new ServicioLavadora();
//        Electrodomestico lavadora1 = sl.crearLavadora();
//        lavadora1.precioFinal();
//        Electrodomestico lavadora2 = sl.crearLavadora();
//        lavadora2.precioFinal();

        ServicioTelevisor st = new ServicioTelevisor();
//        Electrodomestico tele1 = st.crearTelevisor();
//        tele1.precioFinal();
//        Electrodomestico tele2 = st.crearTelevisor();
//        tele2.precioFinal();

        String op;
        String opc;
        boolean aux = true;

        ArrayList<Electrodomestico> elec = new ArrayList();
//        elec.add(lavadora1);
//        elec.add(lavadora2);
//        elec.add(tele1);
//        elec.add(tele2);

        do {
            System.out.println("Que electrodoméstico desea ingresar?");
            System.out.println("1. Lavadora");
            System.out.println("2. Televisor");
            op = leer.next();
            switch (op) {
                case "1":
                    Electrodomestico l = sl.crearLavadora();
                    elec.add(l);
                    break;
                case "2":
                    Electrodomestico t = st.crearTelevisor();
                    elec.add(t);
                    break;
                default:
                    System.out.println("La opción ingresada no es correcta");
            }
            System.out.println("Desea ingresar otro electrodoméstico? S/N");
            opc = leer.next();
            if (opc.equalsIgnoreCase("N")) {
                aux = false;
            }

        } while (aux);

        double precioTotal = 0;

        for (int i = 0; i < elec.size(); i++) {
            elec.get(i).precioFinal();
            System.out.println("El precio de " + elec.get(i).getClass() + " es " + elec.get(i).getPrecio());
            precioTotal = precioTotal + elec.get(i).getPrecio();
        }
        System.out.println("El precio de todos los electrodomesticos es " + precioTotal);

    }

}
