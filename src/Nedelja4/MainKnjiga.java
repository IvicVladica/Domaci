package Nedelja4;

public class MainKnjiga {
    public static void main(String[] args) {
        Knjiga k1 = new Knjiga("Robert Dzordan", "Zenica Sveta", 9.7);
        Knjiga k2 = new Knjiga("Daniel Suarez", "Demon", 9.5);
        Knjiga k3 = new Knjiga("Daniel Suarez", "Sloboda", 9.1);
        k1.ispisiString();
        k2.ispisiString();
        k3.ispisiString();
        OsobaA o1 = new OsobaA("Vlada", "Ivic", 1981, "farmaceut");
        System.out.println(o1);;
        SuperHeroj s1 = new SuperHeroj("Vlada", "Ivic", 1981, "farmaceut", "programer", "java");
        System.out.println(s1);
    }
}
