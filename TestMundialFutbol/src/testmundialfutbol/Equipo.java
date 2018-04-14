package testmundialfutbol;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yaki's
 */
public class Equipo {

    private String nombre;
    private List<Partido> partidosJugados = new ArrayList<>();
    private Resultado resultado;
    private Equipo local;
    private Equipo visitante;
    
    public Equipo (Resultado resultado, int golesLocal, int golesVisitante) {
        this.resultado.setResultado(golesLocal, golesVisitante);
    }

    public ArrayList<Partido> getPartidosJugados() {
        return this.getPartidosJugados();
    }

    public void setPartidosJugados(ArrayList<Partido> PartidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Resultado getResultado() {
        return this.resultado;
    }
    
    public Equipo getLocal() {
        return this.local;
    }
    
    public Equipo getVisitante() {
        return this.visitante;
    }
    
}
