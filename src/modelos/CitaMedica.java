package modelos;

import interfaces.Notificable;
import interfaces.Persistible;

public class CitaMedica implements Persistible, Notificable {
    private String paciente;
    private String especialidad;
    private String fechaHora;

    public CitaMedica(String paciente, String especialidad, String fechaHora) {
        this.paciente = paciente;
        this.especialidad = especialidad;
        this.fechaHora = fechaHora;
    }

    @Override
    public boolean guardar() {
        System.out.println("Cita registrada: " + paciente + " | " + especialidad + " | " + fechaHora);
        return true;
    }

    @Override
    public void enviarNotificacion(String destino) {
        if (destino == null || destino.isBlank()) {
            System.out.println("No se puede enviar el recordatorio: destino vacío.");
            return;
        }
        System.out.println("Recordatorio de cita enviado a " + destino + ": "
                + paciente + " - " + especialidad + " (" + fechaHora + ")");
    }
}
