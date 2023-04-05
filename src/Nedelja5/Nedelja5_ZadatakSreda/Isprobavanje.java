package Nedelja5.Nedelja5_ZadatakSreda;

import java.util.ArrayList;
import java.util.Scanner;

public class Isprobavanje {
    public static void main(String[] args) {
        System.out.println(Znakovi.dozvoljeniZnakovi);
        Scanner sc = new Scanner(System.in);
        ArrayList<String> niz = new ArrayList<>();

        for (int i=0; i<4; i++) {
            var input = sc.next();
            niz.add(input);
        }
        if (!Znakovi.dozvoljeniZnakovi.containsAll(niz)) {
            System.out.println("Neodgovarajuci unos!");
        }
        System.out.println(niz);

    }
}
