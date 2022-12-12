package Servicio;

import Entidad.Televisor;
import java.util.Scanner;

public class ServicioTelevisor extends ServicioElectro{

    Scanner leer = new Scanner(System.in);

    public Televisor crearTelevisor() {

        Televisor tele = new Televisor();
        tele = (Televisor) crearElectrodomestico(tele);
        System.out.println("Ingrese la resolución en pulgadas");
        tele.setResolucion(leer.nextInt());
        System.out.println("Posee TDT S/N");
        String sinto = leer.next();
        if (sinto.equalsIgnoreCase("S")) {
            tele.setTDT(true);
        } else {
            tele.setTDT(false);
        }
        return tele;
    }
}
