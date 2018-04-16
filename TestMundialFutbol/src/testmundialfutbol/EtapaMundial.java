package testmundialfutbol;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yaki's
 */
public abstract class EtapaMundial {

    //Variables
    private String descripcionEtapa;
    private List<Partido> partidos;

    //Constructor
    public void EtapaMundial() {
        this.partidos = new ArrayList();
    }

    //Obtiene la descripcion de la etapa
    public String getDescripcionEtapa() {
        return this.descripcionEtapa;
    }

    //Agrega un partido a la lista
    public void addPartido(Partido unPartido) {
        partidos.add(unPartido);
    }

    //Obtiene la lista de partidos
    protected List<Partido> getPartidos() {
        return this.partidos;
    }

    //Este método abstracto vuelve abstracta la clase
    public abstract List<Equipo> getEquiposQueAvanzan();

}
