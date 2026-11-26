package modelos;

import interfaces.Exportable;
import interfaces.Notificable;
import interfaces.Persistible;

public class RecetaMedica implements Exportable, Persistible, Notificable {
    private String codigo;
    private String paciente;
    private String medicamento;

    public RecetaMedica(String codigo, String paciente, String medicamento) {
        this.codigo = codigo;
        this.paciente = paciente;
        this.medicamento = medicamento;
    }

    @Override
    public String exportar() {
        // TODO [Issue #2 - Integrante 2]: Retornar la receta formateada con codigo, paciente y medicamento.
        return "PENDIENTE_RECETA";
    }

    @Override
    public boolean guardar() {
        // TODO [Issue #2 - Integrante 2]: Imprimir aviso de guardado de receta y retornar true.
        return false;
    }

    @Override
    public void enviarNotificacion(String destino) {
        // TODO [Issue #2 - Integrante 2]: Imprimir aviso de envio de receta digital al destino.
    }
}
