package servicios;

import interfaces.Exportable;
import interfaces.Notificable;
import interfaces.Persistible;

public class ServicioClinico {

    public void procesarExportacion(Exportable documento) {
        // TODO [Issue #4 - Integrante 4]: Imprimir documento.exportar().
    }

    public void procesarGuardado(Persistible registro) {
        // TODO [Issue #4 - Integrante 4]: Llamar a registro.guardar() e imprimir resultado booleano.
    }

    public void despacharAviso(Notificable aviso, String destino) {
        // TODO [Issue #4 - Integrante 4]: Invocar aviso.enviarNotificacion(destino).
    }
}
