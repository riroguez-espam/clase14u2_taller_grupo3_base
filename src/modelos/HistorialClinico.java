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
        // TODO [Issue #3 - Integrante 3]: Retornar el historial clinico en formato JSON o PDF textual.
        return "PENDIENTE_HISTORIAL";
    }

    @Override
    public boolean guardar() {
        // TODO [Issue #3 - Integrante 3]: Imprimir confirmacion de guardado del historial y retornar true.
        return false;
    }
}
