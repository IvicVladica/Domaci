package Nedelja1.Nedelja1_ZadaciSreda;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        System.out.println("Unesite trocifren broj");
        Scanner sc = new Scanner(System.in);

        int Number = sc.nextInt();
        int First = Number / 100;
        int Number2 = Number % 100;
        int Second = Number2 / 10;
        int Third = Number2 % 10;

        System.out.println("Cifre stotine je " + First);
        System.out.println("Cifre desetice je " + Second);
        System.out.println("Cifre jedinice je " + Third);

        if ((Math.pow(First, 3) + Math.pow(Second, 3) + Math.pow(Third, 3)) == Number) {
            System.out.println("Broj jeste Armstrongov");
        }

    }
}
