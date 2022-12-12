package Servicio;

import Entidad.Lavadora;
import java.util.Scanner;

public class ServicioLavadora extends ServicioElectro {

    Scanner leer = new Scanner(System.in);

    public Lavadora crearLavadora() {

        Lavadora lavadora = new Lavadora();
        lavadora = (Lavadora) crearElectrodomestico(lavadora);
        System.out.println("Ingrese la carga en kg");
        lavadora.setCarga(leer.nextInt());

        return lavadora;
    }
}
