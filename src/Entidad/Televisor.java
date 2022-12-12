package Entidad;

public class Televisor extends Electrodomestico {

    private Integer resolucion;
    private boolean TDT;

    public Televisor() {
    }

    public Televisor(Integer resolucion, boolean TDT, Double precio, String color, char consumo, Double peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }

    @Override
    public String toString() {
        return "Televisor{" + "resolucion=" + resolucion + ", TDT=" + TDT + '}';
    }

    @Override
    public void precioFinal() {
        super.precioFinal(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody

        if (resolucion
                > 40) {
            precio = precio * 1.3;
        }
        if (TDT) {
            precio = precio + 500;
        }
    }
}
