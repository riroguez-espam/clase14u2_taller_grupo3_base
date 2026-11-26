package modelos;

import interfaces.Exportable;
import interfaces.Persistible;

public class HistorialClinico implements Exportable, Persistible {
    private String paciente;
    private String diagnostico;

    public HistorialClinico(String paciente, String diagnostico) {
        this.paciente = paciente;
        this.diagnostico = diagnostico;
    }

    @Override
    public String exportar() {
        return "Historial Clinico [Paciente: " + paciente + ", Diagnostico: " + diagnostico + "]";
    }

    @Override
    public boolean guardar() {
        System.out.println("Historial clinico de " + paciente + " guardado exitosamente.");
        return true;
    }
}
