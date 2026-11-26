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
        // TODO [Issue #1 - Integrante 1]: Imprimir aviso de registro de cita y retornar true.
        return false;
    }

    @Override
    public void enviarNotificacion(String destino) {
        // TODO [Issue #1 - Integrante 1]: Imprimir recordatorio de cita enviado al destino indicado.
    }
}
