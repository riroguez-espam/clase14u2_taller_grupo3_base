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
        return "Receta [" + codigo + "] - Paciente: " + paciente + " | Medicamento: " + medicamento;
    }

    @Override
    public boolean guardar() {
        System.out.println("Receta médica " + codigo + " guardada en el sistema.");
        return true;
    }

    @Override
    public void enviarNotificacion(String destino) {
        System.out.println("Enviando receta digital " + codigo + " al destino: " + destino);
    }
}
