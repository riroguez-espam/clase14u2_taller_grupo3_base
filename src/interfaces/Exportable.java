package interfaces;

/**
 * Contrato para entidades clínicas que pueden exportarse a una representación textual.
 */
public interface Exportable {

    /**
     * Genera la representación exportable de la entidad.
     *
     * @return cadena con el contenido formateado para exportación
     */
    String exportar();
}
