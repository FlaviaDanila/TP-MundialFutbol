
package testmundialfutbol;

import java.util.Date;

/**
 *
 * @author Yaki's
 */

public class Partido {

    static void add(Equipo sacachispas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //Variables
    private Date fecha;
    private Equipo local;
    private Equipo visitante;
    private Resultado resultado;
    
    //Constructor
    public Partido(Date fecha, Equipo local, Equipo visitante, int golesLocal, int golesVisitante) {
        this.fecha = fecha;
        this.local = local;
        this.visitante = visitante;
        this.resultado.setResultado(golesLocal, golesVisitante);
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
     
}
