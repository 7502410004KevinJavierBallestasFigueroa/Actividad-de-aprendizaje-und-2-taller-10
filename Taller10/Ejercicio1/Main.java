package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona estudiante1 = new Estudiante();
        Persona profesor1 = new Profesor();
        System.out.println("Presentación de la persona:");
        persona1.presentarse();
        System.out.println("Presentación del estudiante:");
        estudiante1.presentarse();
        System.out.println("Presentación del profesor:");
        profesor1.presentarse();
    }
}

