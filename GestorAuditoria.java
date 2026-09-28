package Ejercicio34_exportacionLogs;

import java.util.ArrayList;
import java.util.List;

public class GestorAuditoria {
    private List<DestinoLog> destinos = new ArrayList<>();

    public void agregarDestino(DestinoLog destino) {
        destinos.add(destino);
    }

    public void difundir(String nivel, String mensaje) {
        System.out.println("Difundiendo registro " + nivel + " a " + destinos.size() + " destinos:");
        for (DestinoLog d : destinos) {
            d.guardarRegistro(nivel, mensaje);
        }
    }
}
