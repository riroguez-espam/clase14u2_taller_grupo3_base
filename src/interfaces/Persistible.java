package interfaces;

/**
 * Contrato para entidades clínicas que pueden almacenarse de forma persistente.
 */
public interface Persistible {

    /**
     * Guarda o registra la entidad en el medio de persistencia correspondiente.
     *
     * @return {@code true} si el registro se completó correctamente; {@code false} en caso contrario
     */
    boolean guardar();
}
