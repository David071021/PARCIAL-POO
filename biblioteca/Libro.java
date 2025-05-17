public class Libro extends Contenido implements Evaluable, Citable {
    private boolean prestado;

    public Libro(String titulo, String autor, int anio) {
        super(titulo, autor, anio);
        this.prestado = false;
    }

    public void prestar() {
        prestado = true;
        System.out.println("El libro ha sido prestado.");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Libro: " + titulo + ", Autor: " + autor + ", Año: " + anio);
    }

    @Override
    public void evaluar(int puntaje, String comentario) {
        System.out.println("Evaluación: " + puntaje + " estrellas. Comentario: " + comentario);
    }

    @Override
    public void citar(String referencia) {
        System.out.println("Citado en: " + referencia);
    }
}
