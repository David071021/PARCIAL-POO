public abstract class Contenido {
    protected String titulo;
    protected String autor;
    protected int anio;

    public Contenido(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    public abstract void mostrarInformacion();
}
