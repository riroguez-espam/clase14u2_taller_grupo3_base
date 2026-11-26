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

        // Pruebas desacopladas mediante ServicioClinico
        System.out.println("=== PRUEBAS DE EXPORTACIÓN ===");
        servicio.procesarExportacion(receta);
        servicio.procesarExportacion(historial);

        System.out.println("\n=== PRUEBAS DE GUARDADO ===");
        servicio.procesarGuardado(cita);
        servicio.procesarGuardado(receta);
        servicio.procesarGuardado(historial);

        System.out.println("\n=== PRUEBAS DE NOTIFICACIÓN ===");
        servicio.despacharAviso(cita, "paciente1@correo.com");
        servicio.despacharAviso(receta, "+593987654321");
    }
}
