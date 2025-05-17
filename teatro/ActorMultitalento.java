public class ActorMultitalento extends Actor implements ICantante, IBailarin {

    public ActorMultitalento(String nombre, int edad, String personaje) {
        super(nombre, edad, personaje);
    }

    @Override
    public void cantar() {
        System.out.println(nombre + " está cantando.");
    }

    @Override
    public void bailar() {
        System.out.println(nombre + " está bailando.");
    }
}