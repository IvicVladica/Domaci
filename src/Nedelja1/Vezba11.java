package Nedelja1;

import java.util.Scanner;

public class Vezba11 {
    public static void main(String[] args) {

        System.out.println("Unesite broj");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int zbirParnih = 0;
        int zbirNeparnih = 0;


        for (int a = 0; a < n; a++) {

            if (a % 2 == 0) {
                zbirParnih = zbirParnih + a;

            } else {
                zbirNeparnih = zbirNeparnih + a;
            }
        }
        System.out.println("Zbir parnih je " + zbirParnih);
        System.out.println("Zbir neparnih je " + zbirNeparnih);
    }
}

