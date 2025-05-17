public class Director extends Participante {

    public Director(String nombre, int edad) {
        super(nombre, edad);
    }

    public void dirigirObra() {
        System.out.println(nombre + " está dirigiendo la obra.");
    }

    public void asistirEnsayo() {
        System.out.println(nombre + " está asistiendo al ensayo.");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Director: " + nombre + ", Edad: " + edad);
    }
}