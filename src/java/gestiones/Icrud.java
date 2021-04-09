
package gestiones;

/**
 *
 * @author juane
 */

import java.util.List;

/**
 *
 * @author juane
 * @param <parametro>
 */
public interface Icrud<parametro> {

    /**
     *
     * @param p
     */
    public abstract void insertar(parametro p);

    /**
     *
     * @param p
     */
    public abstract void modificar(parametro p);

    /**
     *
     * @param p
     */
    public abstract void eliminar(parametro p);

    /**
     *
     * @param p
     * @return
     */
    public abstract parametro consultaIndividual(parametro p);

    /**
     *
     * @return
     */
    public abstract List<parametro> consultar();
}

