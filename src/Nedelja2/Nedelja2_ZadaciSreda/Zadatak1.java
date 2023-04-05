package Nedelja2.Nedelja2_ZadaciSreda;//1. Написати функцију која проверава да ли је година преступна
//        Услови исти као прошле недеље
//        Уместо исписа, функција ВРАЋА truе или false
//        isLeap(1900) -> false
//        isLeap(1992) -> true

import java.util.Scanner;

public class Zadatak1 {
    public static boolean isleap(int x) {
        boolean provera = false;
        if (x % 4 == 0) {
            if ((x % 4 == 0 && x % 100 != 0) || (x % 400 == 0)) {
                provera = true;
            }
        }
        return provera;
    }

    public static void main(String[] args) {
        System.out.println("Unesite godinu: ");
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        boolean check = isleap(year);
        System.out.println(check);
    }
}