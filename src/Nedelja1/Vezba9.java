package Nedelja1;

import java.util.Scanner;

public class Vezba9 {
    public static void main(String[] args) {
        System.out.println("Unesite prihod i rashod");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean check;
        if (a + b > c && a + c > b && b + c > a) {
            check = true;
        } else {
            check = false;
        }

        System.out.println(check);


    }
}
