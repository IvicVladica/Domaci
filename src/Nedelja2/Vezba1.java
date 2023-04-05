package Nedelja2;

import java.util.Scanner;

public class Vezba1 {

    public static int Minimum(int x, int y) {
        int min;
        if (x < y) {
            min = x;
        } else min = y;
        return min;
    }

    public static int Minimum3(int x, int y, int z) {
        int min;
        if (x < y && x < z) {
            min = x;
        }
        if (y < x && y < z) {
            min = x;
        } else {
            min = z;
        }
        return min;
    }

    public static int Zbir(int n, int m) {
        int sum = 0;
        for  (; n <= m; n++) {
            sum = sum + n;
        }
            return sum;
        }


    public static int Stepen(int x, int n) {
        int step = 1;

        for (int i = 0; i < n; i++) {
            step = step * x;
        }
        return step;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

       int x = Minimum(number1, number2);
       System.out.println("Najmanji broj je " + x);

        int StepenBroja = Stepen(number1, number2);
        System.out.println(StepenBroja);

        System.out.println(Zbir(number1, number2));

    }
}
