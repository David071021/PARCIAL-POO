public abstract class Participante {
    protected String nombre;
    protected int edad;

    public Participante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public abstract void mostrarInformacion();
}