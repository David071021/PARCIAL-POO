import java.util.List;

public class Fisico extends Experimento implements Replicable {
    private List<String> materiales;

    public Fisico(String id, int duracion, String responsable, List<String> materiales) {
        super(id, duracion, responsable);
        this.materiales = materiales;
    }

    public void medirConSensores() {
        System.out.println("Midiendo resultados con sensores para materiales: " + materiales);
    }

    @Override
    public void realizar() {
        System.out.println("Realizando experimento físico con materiales: " + materiales);
    }

    @Override
    public Experimento replicar() {
        System.out.println("Replicando experimento físico...");
        return new Fisico(id + "_replica", duracion, responsable, materiales);
    }
}
