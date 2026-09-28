package Ejercicio34_exportacionLogs;

public class LogArchivoLocal implements DestinoLog {
    @Override
    public void guardarRegistro(String nivel, String mensaje) {
        System.out.println("[Archivo] Escribiendo en /var/log/app.log -> " + nivel + ": " + mensaje);
    }
}
