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
        System.out.println("");

        //Cargar equipos
        Equipo bada = new Equipo();
        bada.setNombre("Badajoz");
        Equipo sacachi = new Equipo();
        sacachi.setNombre("Sacachispas");
        Equipo elPorve = new Equipo();
        elPorve.setNombre("ElPorvenir");
        Equipo santa = new Equipo();
        santa.setNombre("Santamarina");
        
        //Cargar partidos y resultados
        Partido primerP = new Partido(new Date(), bada, sacachi);
        Partido segundoP = new Partido(new Date(), elPorve, santa);
        Partido tercerP = new Partido(new Date(), bada, elPorve);
        Partido cuartoP = new Partido(new Date(), sacachi, santa);
        Partido quintoP = new Partido(new Date(),  bada, santa);
        Partido sextoP = new Partido(new Date(), sacachi, elPorve);
        Resultado primerR = new Resultado(3, 2);
        Resultado segundoR = new Resultado(1, 1);
        Resultado tercerR = new Resultado(0, 0);
        Resultado cuartoR = new Resultado(1, 4);
        Resultado quintoR = new Resultado(0, 2);
        Resultado sextoR = new Resultado(1, 2);
        
        //Imprimir partidos a jugar y resultados
        System.out.println(primerP);
        System.out.println(primerR);
        System.out.println(segundoP);
        System.out.println(segundoR);
        System.out.println(tercerP);
        System.out.println(tercerR);
        System.out.println(cuartoP);
        System.out.println(cuartoR);
        System.out.println(quintoP);
        System.out.println(quintoR);
        System.out.println(sextoP);
        System.out.println(sextoR);
        
        
        
    }

}
