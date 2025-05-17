public class Main {
    public static void main(String[] args) {
        Actor actor = new Actor("Luis", 30, "Hamlet");
        actor.mostrarInformacion();
        actor.actuar();

        Tecnico tecnico = new Tecnico("Ana", 40, "iluminación");
        tecnico.mostrarInformacion();
        tecnico.prepararEscenario();

        Director director = new Director("Carlos", 50);
        director.mostrarInformacion();
        director.dirigirObra();
        director.asistirEnsayo();

        ActorMultitalento artista = new ActorMultitalento("Laura", 28, "Julieta");
        artista.mostrarInformacion();
        artista.actuar();
        artista.cantar();
        artista.bailar();
    }
}