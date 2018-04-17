
package testmundialfutbol;

import java.util.Date;

/**
 *
 * @author Yaki's
 */

public class Partido {

    //Variables
    private Date fecha;
    private Equipo local;
    private Equipo visitante;
    private Resultado resultado;
    
    //Constructor
    public Partido(Date fecha, Equipo local, Equipo visitante) {
        this.fecha = fecha;
        this.local = local;
        this.visitante = visitante;
    }
    
    //Obtiene el resultado
    public Resultado getResultado() {
        return this.resultado;
    }
    
    //Obtiene el equipo local
    public Equipo getLocal() {
        return this.local;
    }
    
    //Obtiene el equipo visitante
    public Equipo getVisitante() {
        return this.visitante;
    }
     
    @Override
    public String toString() {
        return "El partido se jugará el "+ this.fecha + " entre " + this.local + " Vs. " + this.visitante;
    }
}
