
package gestiones;
import clases.*;
import java.util.List;

/**
 *
 * @author juane
 */
public class gestionhabitacion implements Icrud<cliente>{
    private List<cliente> listacliente;


    public List<cliente> getListacliente() {
        return listacliente;
    }

    /**
     * @param listacliente
     */
    public void setListacliente(List<cliente> listacliente) {
        this.listacliente = listacliente;
    }

    /**
     *
     * @param p
     */
    @Override
    public void insertar(cliente p) {
    listacliente.add(p);
    }

    /**
     *
     * @param p
     */
    @Override
    public void modificar(cliente p) {
    cliente auxiliarcliente = consultaIndividual(p);
    auxiliarcliente.setCedula(p.getCedula());
    auxiliarcliente.setNombre(p.getNombre());
    auxiliarcliente.setApellido(p.getApellido());
    auxiliarcliente.setFecha_reserva(p.getFecha_reserva());
    auxiliarcliente.setHabitaciones(p.getHabitaciones());
    
    }

    /**
     *
     * @param p
     */
    @Override
    public void eliminar(cliente p) {
    cliente auxiliar = this.consultarIndividual(p.getCedula());
    listacliente.remove(auxiliar);
    }

    /**
     *
     * @param p
     * @return
     */
    @Override
    public cliente consultaIndividual(cliente p) {
        try {
            return listacliente.stream().filter(x -> (x.getCedula() == null ? p.getCedula() == null : x.getCedula().equals(p.getCedula()))).findFirst().get();
        } catch (Exception e) {
            return null;
        }
    }

    /**
     *
     * @return
     */
    @Override
    public List<cliente> consultar() {
    return listacliente;
    }

    /**
     *
     * @param paramcedula
     * @return
     */
    public cliente consultarIndividual(String paramcedula){
        try {
            return listacliente.stream().filter(x -> (x.getCedula() == null ? paramcedula == null : x.getCedula().equals(paramcedula))).findFirst().get();
        } catch (Exception e) {
            return null;
        }
   
    }
}
