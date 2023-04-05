package Nedelja1.Nedelja1_ZadaciSreda;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        System.out.println("Unesite godinu koju zelite da proverite");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year % 4 == 0) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("Godina je prestupna");
            } else {
                System.out.println("Godina nije prestupna");
            }
        } else {
            System.out.println("Godina nije prestupna");
        }
    }
}




