package Ejercicio34_exportacionLogs;

public class LogServicioNube implements DestinoLog {
    @Override
    public void guardarRegistro(String nivel, String mensaje) {
        System.out.println("[Nube] POST https://logs.ejemplo.com/api {nivel: " + nivel + ", mensaje: " + mensaje + "}");
    }
}
