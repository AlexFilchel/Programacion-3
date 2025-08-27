
public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona();

        Persona persona2 = new Persona("Alexander", 21);

        System.out.println("Persona 1 \nNombre: " + persona1.getNombre() + "\nEdad: " + persona1.getEdad());
        System.out.println("\nPersona 2 \nNombre: " + persona2.getNombre() + "\nEdad: " + persona2.getEdad());
    }
}