package guia_herencia_ej2;

import Entidad.Electrodomestico;
import Entidad.Lavadora;
import Servicio.ServicioLavadora;
import Servicio.ServicioTelevisor;
import java.util.ArrayList;

public class Guia_herencia_ej2 {

    public static void main(String[] args) {

        
        ServicioLavadora sl = new ServicioLavadora();
        Electrodomestico lavadora1 = sl.crearLavadora();
        lavadora1.precioFinal();
        Electrodomestico lavadora2 = sl.crearLavadora();
        lavadora2.precioFinal();
        
        ArrayList<Electrodomestico> elec = new ArrayList();
        elec.add(lavadora1);
        elec.add(lavadora2);
        
        for (Electrodomestico aux : elec) {
            if (aux instanceof Lavadora) {
                Lavadora object = (Lavadora) aux;
                System.out.println("Soy una lavadora");
            }
        }
        

//        System.out.println(lavadora1.getPrecio());
//        System.out.println(lavadora2.getPrecio());
//        System.out.println(lavadora1.getColor());
//        System.out.println(lavadora1.getConsumo());
//        System.out.println(lavadora1.getPeso());

//        ServicioTelevisor st = new ServicioTelevisor();
//        Electrodomestico tele = st.crearTelevisor();
//        tele.precioFinal();
//
//        System.out.println(tele.getPrecio());
    }
}
