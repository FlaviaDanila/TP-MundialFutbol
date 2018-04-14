package testmundialfutbol;

import java.util.List;

/**
 *
 * @author Yaki's
 */
public abstract class EtapaMundial {

    private String descripcionEtapa;
    private List<Partido> partidos;

    public void EtapaMundial() {
    }

    public String getDescripcionEtapa() {
        return this.descripcionEtapa;
    }

    public void addPartido(Partido p) {
        partidos.add(p);
    }

    protected List<Partido> getPartidos() {
        return this.partidos;
    }

    public abstract List<Equipo> getEquiposQueAvanzan();

}
