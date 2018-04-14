
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
       List<Equipo> badajoz = new ArrayList<>();
        for(Iterator<Partido> iter = super.getPartidos().iterator(); iter.hasNext();)
        {
         Partido serieA = iter.next();
        if (serieA.getResultado().ganoLocal()){
         badajoz.add(serieA.getLocal());
        }
        if (!serieA.getResultado().ganoLocal() && !serieA.getResultado().empate()){
         badajoz.add(serieA.getVisitante());
        }
    }
        return badajoz;
    }
    
    
    
}
