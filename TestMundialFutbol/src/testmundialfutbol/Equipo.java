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
    private int golesQueHice;
    private int golesQueMeHicieron;
    private int diferenciaDeGoles;

    public Equipo(Resultado resultado, int golesLocal, int golesVisitante) {
        this.resultado.setResultado(golesLocal, golesVisitante);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setPartidosJugados(ArrayList<Partido> partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public ArrayList<Partido> getPartidosJugados() {
        return this.getPartidosJugados();
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

    public int getGolesQueHice() {
        return golesQueHice;
    }

    public void setGolesQueHice(int golesQHice) {
        this.golesQueHice = golesQueHice;
    }

    public int getGolesQueMeHicieron() {
        return golesQueMeHicieron;
    }

    public void setGolesQueMeHicieron(int golesQMeHicieron) {
        this.golesQueMeHicieron = golesQueMeHicieron;
    }

    public int getDiferenciaDeGoles() {
        if (this.golesQueHice > this.golesQueMeHicieron) {
            diferenciaDeGoles = this.golesQueHice - this.golesQueMeHicieron;
        } else {
            diferenciaDeGoles = this.golesQueMeHicieron - this.golesQueHice;
        }
        return this.diferenciaDeGoles;
    }

    public void setDiferenciaDeGoles(int diferenciaDeGoles) {
        this.diferenciaDeGoles = diferenciaDeGoles;
    }

}
