package Nedelja1;

import java.util.Scanner;

public class Vezba14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite broj ");
        int Number = sc.nextInt();

        switch (Number) {
            case 1: System.out.println("Odgovor je 1");break;
            case 2: System.out.println("Odgovor je 2");break;
            case 3: System.out.println("Odgovor je 3");break;
            case 4: System.out.println("Odgovor je 4");break;

            default: System.out.println("Odgovor ne postoji!");

        }
    }
}
