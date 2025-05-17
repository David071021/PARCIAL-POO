import java.util.List;

public class Quimico extends Experimento implements Peligroso {
    private List<String> reactivos;
    private double temperatura;

    public Quimico(String id, int duracion, String responsable, List<String> reactivos, double temperatura) {
        super(id, duracion, responsable);
        this.reactivos = reactivos;
        this.temperatura = temperatura;
    }

    public void controlarTemperatura() {
        System.out.println("Controlando la temperatura: " + temperatura + "°C");
    }

    @Override
    public void realizar() {
        System.out.println("Realizando experimento químico con reactivos: " + reactivos);
    }

    @Override
    public String riesgo() {
        return "Riesgo alto por reacción química.";
    }
}
