package Composicion;

public class Main {

    public static void main(String[] args){

        Auto auto = new Auto("Audi", "Rojo", "Radiales", "Gasolinero");

        System.out.println("Marca: "+auto.getMarca());
        System.out.println("Color: "+auto.getColor());
        auto.getMotor().getTipo();
        auto.getLlanta().getModelo();
    }
}
