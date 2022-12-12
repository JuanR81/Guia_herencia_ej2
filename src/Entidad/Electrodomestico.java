package Entidad;

public class Electrodomestico {

    protected Double precio;
    protected String color;
    protected char consumo;
    protected Double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, char consumo, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + '}';
    }

    public void precioFinal() {

        if (Character.toUpperCase(consumo) == 'A') {
            precio = precio + 1000;
        }
        if (Character.toUpperCase(consumo) == 'B') {
            precio = precio + 800;
        }
        if (Character.toUpperCase(consumo) == 'C') {
            precio = precio + 600;
        }
        if (Character.toUpperCase(consumo) == 'D') {
            precio = precio + 500;
        }
        if (Character.toUpperCase(consumo) == 'E') {
            precio = precio + 300;
        }
        if (Character.toUpperCase(consumo) == 'F') {
            precio = precio + 100;
        }
        if (peso >= 1 && peso < 19) {
            precio = precio + 100;
        }
        if (peso >= 20 && peso < 49) {
            precio = precio + 500;
        }
        if (peso >= 50 && peso < 79) {
            precio = precio + 800;
        }
        if (peso >= 80) {
            precio = precio + 1000;
        }
    }

}
