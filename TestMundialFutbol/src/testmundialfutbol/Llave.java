package testmundialfutbol;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Yaki's
 */
public class Llave extends EtapaMundial {

    @Override
    public List<Equipo> getEquiposQueAvanzan() {
        List<Equipo> sacachispas = new ArrayList<>();
        for (Iterator<Equipo> iter = this.getEquiposQueAvanzan().iterator(); iter.hasNext();) {
            Equipo llaveA = iter.next();
            if (llaveA.getResultado().ganoLocal()) {
                sacachispas.add(llaveA.getLocal());
            }
            if (!llaveA.getResultado().ganoLocal() && !llaveA.getResultado().empate()) {
                sacachispas.add(llaveA.getVisitante());
            }
        }
        return sacachispas;
    }
    
    
    
}
