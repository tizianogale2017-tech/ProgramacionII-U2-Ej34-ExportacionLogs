package Ejercicio34_exportacionLogs;

public class LogBaseDatos implements DestinoLog {
    @Override
    public void guardarRegistro(String nivel, String mensaje) {
        System.out.println("[BaseDatos] INSERT INTO logs(nivel, mensaje) VALUES ('" + nivel + "', '" + mensaje + "')");
    }
}
