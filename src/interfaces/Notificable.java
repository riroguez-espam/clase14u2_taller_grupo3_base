package interfaces;

/**
 * Contrato para entidades clínicas capaces de emitir notificaciones o recordatorios.
 */
public interface Notificable {

    /**
     * Envía una notificación asociada a la entidad hacia el destino indicado.
     *
     * @param destino correo, teléfono o canal al que se envía la notificación
     */
    void enviarNotificacion(String destino);
}
