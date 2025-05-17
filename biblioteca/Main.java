public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);
        Revista revista = new Revista("National Geographic", "Varios", 2023);
        ArticuloCientifico articulo = new ArticuloCientifico("Teoría cuántica", "Dr. Einstein", 1925, false);

        libro.mostrarInformacion();
        libro.prestar();
        libro.evaluar(5, "Obra maestra.");
        libro.citar("Tesis de Literatura, 2024");

        revista.mostrarInformacion();
        revista.actualizarContenido();

        articulo.mostrarInformacion();
        articulo.descargar();
        articulo.citar("Revista de Física, 2025");
    }
}
