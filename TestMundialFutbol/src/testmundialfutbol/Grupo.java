package testmundialfutbol;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Yaki's
 */
public class Grupo extends EtapaMundial {

    
    @Override
    public List<Equipo> getEquiposQueAvanzan() {
        List<Equipo> parti2 = new ArrayList<>();
        //Recorre la lista de partidos
        for (Iterator<Partido> iter = super.getPartidos().iterator(); iter.hasNext();) {
            Partido grupo = iter.next();
            if (grupo.getResultado().ganoLocal()) {
                parti2.add(grupo.getLocal());
            }
            if (!grupo.getResultado().ganoLocal() && !grupo.getResultado().empate()) {
                parti2.add(grupo.getVisitante());
            }
        }
        return parti2;
    }

}
