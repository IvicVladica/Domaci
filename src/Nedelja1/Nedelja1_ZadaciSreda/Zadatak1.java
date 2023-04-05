package Nedelja1.Nedelja1_ZadaciSreda;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        float x;
        float y;
        boolean CheckPositive;
        boolean CheckSum;

        System.out.println("Unesite dva realna broja");
        Scanner sc = new Scanner(System.in);
        x = sc.nextFloat();
        y = sc.nextFloat();

        float z=x*y;
        if (z > 0) { CheckPositive = true;}
            else CheckPositive = false;

        float Sum=x+y;
        if (Sum > 150) { CheckSum = true;}
            else CheckSum = false;

            float Max = x;
            if (y > x) {
                Max = y;
            }

        System.out.println(CheckPositive);
        System.out.println(CheckSum);
        System.out.println(Max);




    }
}
