package Composicion;

public class Auto {

    private String marca;

    private String color;

    private Llanta llanta;

    private Motor motor;

    public Auto(String marca, String color, String modelo, String tipo) {

        this.marca = marca;
        this.color = color;
        this.llanta = new Llanta(modelo);
        this.motor = new Motor(tipo);
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public Llanta getLlanta() {
        return llanta;
    }
    public Motor getMotor() {
        return motor;
    }
}
