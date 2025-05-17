public abstract class Experimento {
    protected String id;
    protected int duracion;
    protected String responsable;

    public Experimento(String id, int duracion, String responsable) {
        this.id = id;
        this.duracion = duracion;
        this.responsable = responsable;
    }

    public abstract void realizar();
}
