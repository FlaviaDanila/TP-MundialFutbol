package testmundialfutbol;

/**
 *
 * @author Yaki's
 */
public class TestMundialFutbol {

    public static void main(String[] args) {

        System.out.println("Bienvenidos al Mundial de Fútbol");

        Equipo badajoz = new Equipo();
        badajoz.setNombre("Badajoz");

        Equipo sacachispas = new Equipo();
        sacachispas.setNombre("Sacachispas");

        Equipo elPorvenir = new Equipo();
        elPorvenir.setNombre("ElPorvenir");

        Equipo santamarina = new Equipo();
        santamarina.setNombre("Santamarina");

        Partido.add(badajoz);
        Partido.add(sacachispas);
        Partido.add(elPorvenir);
        Partido.add(santamarina);

    }

}
