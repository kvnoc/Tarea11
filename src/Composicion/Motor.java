package Composicion;

public class Motor {

    private String tipo;

    public Motor(String tipo) {
        this.tipo = tipo;
    }

    public void getTipo() {
        System.out.println("Tipo de motor: "+tipo);
    }

}
