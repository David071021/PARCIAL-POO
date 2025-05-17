public class Tecnico extends Participante {
    private String especialidad;

    public Tecnico(String nombre, int edad, String especialidad) {
        super(nombre, edad);
        this.especialidad = especialidad;
    }

    public void prepararEscenario() {
        System.out.println(nombre + " está preparando el escenario con especialidad en " + especialidad);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Técnico: " + nombre + ", Edad: " + edad + ", Especialidad: " + especialidad);
    }
}