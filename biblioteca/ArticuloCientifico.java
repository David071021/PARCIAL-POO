public class ArticuloCientifico extends Contenido implements Citable {
    private boolean accesoAbierto;

    public ArticuloCientifico(String titulo, String autor, int anio, boolean accesoAbierto) {
        super(titulo, autor, anio);
        this.accesoAbierto = accesoAbierto;
    }

    public void descargar() {
        if (accesoAbierto) {
            System.out.println("Descargando artículo...");
        } else {
            System.out.println("Solicitud de permiso para descargar el artículo.");
        }
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Artículo Científico: " + titulo + ", Autor: " + autor + ", Año: " + anio);
    }

    @Override
    public void citar(String referencia) {
        System.out.println("Citado en: " + referencia);
    }
}
