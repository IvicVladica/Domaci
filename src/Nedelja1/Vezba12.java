package Nedelja1;

import java.util.Scanner;

public class Vezba12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite nosivost ");
        int Nosivost = sc.nextInt();
        System.out.println("Unesite broj automobila");
        int Broj = sc.nextInt();
        int ukupnaMasa = 0;

        for (int i = 1; i <= Broj; i++) {
            System.out.println("Unesite masu automobila " + i);
            int Masa = sc.nextInt();
            ukupnaMasa = ukupnaMasa + Masa;
        }
        if (ukupnaMasa >= Nosivost) {
            System.out.println("Prekoracena je nosivost");
        } else {
            System.out.println("Nije prekoracena nosivost");
        }


    }
}
