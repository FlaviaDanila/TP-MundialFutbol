package testmundialfutbol;

/**
 *
 * @author Yaki's
 */
public class Resultado {

    //Variables
    private int golesLocal;
    private int golesVisitante;

    //Constructor
    public Resultado(int golesLocal, int golesVisitante) {
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
    }
    
    //Obtiene los goles del local
    public int getGolesLocal() {
        return this.golesLocal;
    }

    //Obtiene los goles del visitante
    public int getGolesVisitante() {
        return this.golesVisitante;
    }

    //Asigna el resultado del partido
    public void setResultado(int golesLocal, int golesVisitante) {
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
    }

    //Si el equipo local gana retorna un true, sino false
    public boolean ganoLocal() {
        if (this.golesLocal > this.golesVisitante) {
            return true;
        }
        return false;
    }
    
    //Si el equipo visitante gana retorna un true, sino false
    public boolean ganoVisitante() {
        if (this.golesVisitante > this.golesLocal) {
            return true;
        }
        return false;
    }

    //Si los equipos empatan retorna un true, sino false
    public boolean empate() {
        if (this.golesLocal == this.golesVisitante) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String golesL = String.valueOf(golesLocal);
        String golesV = String.valueOf(golesVisitante);
        return "Resultado: " + golesL + "-" + golesV;
    }
}
