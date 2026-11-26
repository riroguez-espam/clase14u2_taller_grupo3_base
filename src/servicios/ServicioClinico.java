package servicios;

import interfaces.Exportable;
import interfaces.Notificable;
import interfaces.Persistible;

public class ServicioClinico {

    public void procesarExportacion(Exportable documento) {
        System.out.println("Exportando documento: " + documento.exportar());
    }

    public void procesarGuardado(Persistible registro) {
        boolean resultado = registro.guardar();
        System.out.println("Resultado de guardado: " + resultado);
    }

    public void despacharAviso(Notificable aviso, String destino) {
        aviso.enviarNotificacion(destino);
    }
}
