package testmundialfutbol;

/**
 *
 * @author Yaki's
 */
public class TestMundialFutbol {

    public static void main(String[] args) {

        System.out.println("Bienvenidos al Mundial de Fútbol");

        Equipo bada = new Equipo();
        bada.setNombre("Badajoz");

        Equipo sacachi = new Equipo();
        sacachi.setNombre("Sacachispas");

        Equipo elPorve = new Equipo();
        elPorve.setNombre("ElPorvenir");

        Equipo santa = new Equipo();
        santa.setNombre("Santamarina");
        
        Partido.add(bada);

    }

}
