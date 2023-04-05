package Nedelja1;

import java.util.Scanner;

public class Vezba13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite broj ");
        int Broj = sc.nextInt();

        while (Broj != 0) {
            System.out.println(Broj);
            System.out.println("Unesite broj ");
            Broj = sc.nextInt();
        }



}
}
