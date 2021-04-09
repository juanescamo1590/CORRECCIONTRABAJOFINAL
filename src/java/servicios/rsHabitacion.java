
package servicios;
import clases.*;
import gestiones.*;
import java.util.List;
import java.util.ArrayList;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author juane
 */
@Path("habitacion")
public class rsHabitacion {

    /**
     *
     */
    public static List<cliente> listadeclientes= new ArrayList<>();

    /**
     *
     */
    public gestionhabitacion gh= new gestionhabitacion();
    
    /**
     *
     * @return
     */
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<cliente> consultar(){
    gh.setListacliente(listadeclientes);
    return gh.consultar();
    }
    
    /**
     *
     * @param param
     * @return
     */
    @GET
    @Path("{parametroconsulta}")
    @Produces({MediaType.APPLICATION_JSON})
    public cliente conultarIndividual(@PathParam("parametroconsulta") String param){
        gh.setListacliente(listadeclientes);
        return gh.consultarIndividual(param);
        
    }
    
    /**
     *
     * @param c
     */
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    public void insertar(cliente c){
        gh.setListacliente(listadeclientes);
        gh.insertar(c);
    }
    
    /**
     *
     * @param cl
     */
    @PUT
    @Consumes({MediaType.APPLICATION_JSON})
    public void modificar(cliente cl){
        gh.setListacliente(listadeclientes);
        gh.modificar(cl);
    }
    
    /**
     *
     * @param eliminar
     */
    @DELETE
    @Path("{parmetroeliminar}")
    public void eliminar(@PathParam ("parmetroeliminar") String eliminar){
        cliente auxiliar= new cliente(eliminar, null, null, null, null);
        gh.setListacliente(listadeclientes);
        gh.eliminar(auxiliar);
               
        
    }
}
