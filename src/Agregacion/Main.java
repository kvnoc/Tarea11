package Agregacion;

public class Main {

    public static void main(String[] args){

        Persona persona = new Persona("Jose", 20);

        System.out.println("Nombre: "+persona.getNombre());
        System.out.println("Edad: "+persona.getEdad());

        Ropa prenda = new Ropa("Polo");
        Ropa prenda2 = new Ropa("Pantalon");
        
        persona.getSmartphone();
        persona.setRopa(prenda);
        persona.setRopa(prenda2);
        persona.getRopa();
    }

}
