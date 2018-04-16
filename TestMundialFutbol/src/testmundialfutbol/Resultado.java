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

    //Considera que si el equipo local gana retorna un true, por descarte false
    public boolean ganoLocal() {
        if (this.golesLocal > this.golesVisitante) {
            return true;
        }
        return false;
    }

    //Considera que si los equipos empatan retorna un true, por descarte false
    public boolean empate() {
        if (this.golesLocal == this.golesVisitante) {
            return true;
        }
        return false;
    }

}
