package Nedelja1;

import java.util.Scanner;

public class Vezba10 {
    public static void main(String[] args) {

            System.out.println("Unesite broj");
            Scanner sc = new Scanner(System.in);

            int x = sc.nextInt();

            int zbir = 0;

            for (int a = 0; a <= x; a ++) {
                zbir = zbir + a;
            }

        System.out.println("Zbir je " + zbir);
    }
}
