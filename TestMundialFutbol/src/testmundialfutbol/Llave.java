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
        List<Equipo> equipos = new ArrayList<>();
        //Recorre la lista de equipos
        for (Iterator<Equipo> iter = this.getEquiposQueAvanzan().iterator(); iter.hasNext();) {
            Equipo llave = iter.next();
            if (llave.getResultado().ganoLocal()) {
                equipos.add(llave.getLocal());
            }
            if (!llave.getResultado().ganoLocal() && !llave.getResultado().empate()) {
                equipos.add(llave.getVisitante());
            }
        }
        return equipos;
    }

}
