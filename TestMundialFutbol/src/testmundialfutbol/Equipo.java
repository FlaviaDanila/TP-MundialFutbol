package testmundialfutbol;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yaki's
 */
public class Equipo {

    //Variables
    private String nombre;
    private List<Partido> partidosJugados = new ArrayList<>();
    private Resultado resultado;
    private Equipo local;
    private Equipo visitante;
    private int golesQueHice;
    private int golesQueMeHicieron;
    private int diferenciaDeGoles;

    //Constructores
    public Equipo() {
    }
    
    public Equipo(Resultado resultado, int golesLocal, int golesVisitante) {
        this.resultado.setResultado(golesLocal, golesVisitante);
    }

    //Obtiene el nombre
    public String getNombre() {
        return this.nombre;
    }
    
    //Asigna el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Obtiene los partidos jugados
    public ArrayList<Partido> getPartidosJugados() {
        return this.getPartidosJugados();
    }

    //Asigna los partidos jugados
    public void setPartidosJugados(ArrayList<Partido> partidosJugados) {
        this.partidosJugados = partidosJugados;
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

    //Obtiene los goles convertidos
    public int getGolesQueHice() {
        return golesQueHice;
    }

    //Asigna los goles convertidos
    public void setGolesQueHice(int golesQHice) {
        this.golesQueHice = golesQueHice;
    }

    //Obtiene los goles recibidos
    public int getGolesQueMeHicieron() {
        return golesQueMeHicieron;
    }

    //Asigna los goles recibidos
    public void setGolesQueMeHicieron(int golesQMeHicieron) {
        this.golesQueMeHicieron = golesQueMeHicieron;
    }

    //Obtiene la diferencia de goles
    public int getDiferenciaDeGoles() {
        if (this.golesQueHice > this.golesQueMeHicieron) {
            diferenciaDeGoles = this.golesQueHice - this.golesQueMeHicieron;
        } else {
            diferenciaDeGoles = this.golesQueMeHicieron - this.golesQueHice;
        }
        return this.diferenciaDeGoles;
    }

    //Asigna la diferencia de goles
    public void setDiferenciaDeGoles(int diferenciaDeGoles) {
        this.diferenciaDeGoles = diferenciaDeGoles;
    }

}
