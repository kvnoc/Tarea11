package Agregacion;

public class Persona {

    private String nombre;

    private int edad;

    private Smartphone smartphone;

    private Ropa ropa[];

    private int prendas;

    public Persona(String nombre, int edad) {

        this.nombre = nombre;
        this.edad = edad;
        this.prendas = 0;
        this.ropa = new Ropa[2];
        this.smartphone = new Smartphone("Samsung");
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void getRopa(){

        System.out.println("Numeros de prendas: "+prendas);
        for (int i = 0; i < prendas; i++){
            ropa[i].mostrarRopa();
        }
    }
    public void setRopa(Ropa agreRopa){

        if (prendas < 2 ){
            ropa[prendas] = agreRopa;
            prendas++;
        }
    }
    public void getSmartphone(){

        smartphone.mostrarSmart();

    }

}
