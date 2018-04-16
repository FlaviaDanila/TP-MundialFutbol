package testmundialfutbol;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yaki's
 */
public class Grupo extends EtapaMundial {

    private int puntos(Equipo unEquipo) {
        int puntos = 0;
        //Recorre la lista de partidos y devuelve los equipos que obtienen 3 puntos o 1 dependiendo del resultado
        for (Partido partidos : unEquipo.getPartidosJugados()) {
            if (partidos.getResultado().ganoLocal() && unEquipo.equals(partidos.getLocal())) {
                puntos += 3;

            }
            if (partidos.getResultado().ganoVisitante() && unEquipo.equals(partidos.getVisitante())) {
                puntos += 3;
            }
            if (partidos.getResultado().empate()) {
                puntos += 1;
            }
        }
        return puntos;
    }

    @Override
    public List<Equipo> getEquiposQueAvanzan() {
        List<Equipo> parti2 = new ArrayList<>();
        //Recorre la lista de partidos y devuelve los equipos que pasan de ronda
        for (Partido grupo : super.getPartidos()) {
            if (puntos(grupo.getLocal()) > puntos(grupo.getVisitante())) {
                parti2.add(grupo.getLocal());
            }
            if (puntos(grupo.getVisitante()) > puntos(grupo.getLocal())) {
                parti2.add(grupo.getVisitante());
            }
        }
        return parti2;
    }

}
