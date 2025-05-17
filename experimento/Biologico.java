public class Biologico extends Experimento implements Replicable, Peligroso {
    private String celulas;

    public Biologico(String id, int duracion, String responsable, String celulas) {
        super(id, duracion, responsable);
        this.celulas = celulas;
    }

    public void seguimientoDiario() {
        System.out.println("Realizando seguimiento diario de las células: " + celulas);
    }

    @Override
    public void realizar() {
        System.out.println("Realizando experimento biológico con células: " + celulas);
    }

    @Override
    public Experimento replicar() {
        System.out.println("Replicando experimento biológico...");
        return new Biologico(id + "_replica", duracion, responsable, celulas);
    }

    @Override
    public String riesgo() {
        return "Riesgo biológico moderado.";
    }
}
