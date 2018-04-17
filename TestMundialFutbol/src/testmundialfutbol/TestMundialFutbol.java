package testmundialfutbol;

import java.util.Date;

/**
 *
 * @author Yaki's
 */
public class TestMundialFutbol {

    public static void main(String[] args) {

        //Apertura de main
        System.out.println("Bienvenidos al Mundial de Fútbol");

        //Cargar equipos
        Equipo bada = new Equipo();
        bada.setNombre("Badajoz");
        Equipo sacachi = new Equipo();
        sacachi.setNombre("Sacachispas");
        Equipo elPorve = new Equipo();
        elPorve.setNombre("ElPorvenir");
        Equipo santa = new Equipo();
        santa.setNombre("Santamarina");
        
        //Cargar partidos
        Partido primerP = new Partido(new Date(), bada, sacachi);
        Partido segundoP = new Partido(new Date(), elPorve, santa);
        Partido tercerP = new Partido(new Date(), bada, elPorve);
        Partido cuartoP = new Partido(new Date(), sacachi, santa);
        Partido quintoP = new Partido(new Date(),  bada, santa);
        Partido sextoP = new Partido(new Date(), sacachi, elPorve);
        
        //Imprimir partidos a jugar
        System.out.println(primerP);
        
        
    }

}
