public class Actor extends Participante {
    private String personaje;

    public Actor(String nombre, int edad, String personaje) {
        super(nombre, edad);
        this.personaje = personaje;
    }

    public void actuar() {
        System.out.println(nombre + " está actuando como " + personaje);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Actor: " + nombre + ", Edad: " + edad + ", Personaje: " + personaje);
    }
}