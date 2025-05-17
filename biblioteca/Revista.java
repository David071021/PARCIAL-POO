public class Revista extends Contenido {
    public Revista(String titulo, String autor, int anio) {
        super(titulo, autor, anio);
    }

    public void actualizarContenido() {
        System.out.println("Contenido de la revista actualizado mensualmente.");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Revista: " + titulo + ", Autor: " + autor + ", Año: " + anio);
    }
}
