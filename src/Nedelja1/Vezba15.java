package Nedelja1;

import java.util.Scanner;

public class Vezba15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean check = true;

        while (check) {
            System.out.println("Unesite pocetno slovo nukleotida ");
            char letter = sc.next().charAt(0);
            switch (letter) {
                case 'A': System.out.println("Adenin");break;
                case 'G': System.out.println("Guanin");break;
                case 'C': System.out.println("Citozin");break;
                case 'T': System.out.println("Timin");break;
                default: System.out.println("Neodgovarajuci unos");check = false; break;
            }
        }

        }
    }

