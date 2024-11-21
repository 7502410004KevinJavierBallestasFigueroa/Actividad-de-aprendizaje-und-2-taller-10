package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo();
        Vehiculo bicicleta1 = new Bicicleta();

        System.out.println("Detalles del movimiento del vehículo:");
        vehiculo1.moverse();
        System.out.println("________________________________________________");
        System.out.println("Detalles del movimiento de la bicicleta:");
        bicicleta1.moverse();
    }
}

