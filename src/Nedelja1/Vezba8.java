package Nedelja1;

import java.util.Scanner;
public class Vezba8 {
    public static void main(String[] args) {
        System.out.println("Unesite prihod i rashod");
        Scanner sc = new Scanner(System.in);
        int Prihod = sc.nextInt();
        int Rashod = sc.nextInt();

        int Saldo = Prihod - Rashod;

        if (Saldo > 0) {
            System.out.println("Rezultat je - Dobitak " + Saldo);
        }
        else {
            System.out.println("Rezultat je - Gubitak " + Math.abs(Saldo));
        }
    }
}
