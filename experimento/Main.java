import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Quimico quimico = new Quimico("Q1", 60, "Dra. Pérez", Arrays.asList("H2O", "NaCl"), 37.5);
        Biologico biologico = new Biologico("B1", 120, "Dr. Gómez", "Células madre");
        Fisico fisico = new Fisico("F1", 90, "Ing. López", Arrays.asList("Cobre", "Imán"));

        quimico.realizar();
        quimico.controlarTemperatura();
        System.out.println(quimico.riesgo());

        biologico.realizar();
        biologico.seguimientoDiario();
        System.out.println(biologico.riesgo());

        Experimento bioReplica = biologico.replicar();
        bioReplica.realizar();

        fisico.realizar();
        fisico.medirConSensores();
        Experimento fisicoReplica = fisico.replicar();
        fisicoReplica.realizar();
    }
}
