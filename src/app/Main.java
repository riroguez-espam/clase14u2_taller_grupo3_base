package app;

import modelos.CitaMedica;
import modelos.HistorialClinico;
import modelos.RecetaMedica;
import servicios.ServicioClinico;

public class Main {
    public static void main(String[] args) {
        ServicioClinico servicio = new ServicioClinico();
        RecetaMedica receta = new RecetaMedica("REC-104", "Paciente 1", "Paracetamol 500mg");
        CitaMedica cita = new CitaMedica("Paciente 1", "Medicina General", "26/11/2026 09:00");
        HistorialClinico historial = new HistorialClinico("Paciente 1", "Control preventivo anual");

        // TODO [Issue #4 - Integrante 4]: Ejecutar exportacion, guardado y notificaciones con ServicioClinico.
        servicio.procesarExportacion(receta);
        servicio.procesarGuardado(cita);
        servicio.procesarExportacion(historial);
    }
}
