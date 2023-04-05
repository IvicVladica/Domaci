package Nedelja4;

public class MainOsoba {

    public static void main(String[] args) {
        Osoba o1 = new Osoba();
        Osoba o2 = new Osoba();

        o1.setIme("James");
        o1.setPrezime("Bond");
        
        System.out.println(o1.getPrezime());
        System.out.println(o1.getIme());
        System.out.println(o1.getPrezime());
    }
    }
