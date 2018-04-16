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
    
    //Constructores
    public Equipo() {
        
    }

    public Equipo(String nombre) {
        this.nombre = nombre;
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
    public List<Partido> getPartidosJugados() {
        return this.partidosJugados;
    }

    //Asigna los partidos jugados
    public void setPartidosJugados(List<Partido> partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    //Obtiene la diferencia de goles
    public int getDiferenciaDeGoles() {

        int golesQueMeHicieron = 0;
        int golesQueHice = 0;
        int diferenciaDeGoles = 0;

        for (Partido parti2 : this.partidosJugados) {
            if (golesQueHice > golesQueMeHicieron) {
                diferenciaDeGoles = golesQueHice - golesQueMeHicieron;
            } else if (golesQueMeHicieron >= golesQueHice) {
                diferenciaDeGoles = golesQueMeHicieron - golesQueHice;
            }

        }
        return diferenciaDeGoles;
    }

}