package Nedelja2.Nedelja2_ZadaciSreda;//2. Написати функцију која проверава да ли је троцифрен број Армстронгов или није
//        Враћа true или false
//        Број је Армстронгов ако је једнак збиру кубова његових цифара
//        нпр. 370 = 3³ + 7³ + 0³ = 27 + 343 + 0 = 370
//        isArmstrong(371) -> true
//        isArmstrong(372) -> false


import java.util.Scanner;

public class Zadatak2 {

    public static boolean isArmstrong (int x){
        boolean provera = false;
        int First = x / 100;
        int x2 = x % 100;
        int Second = x2 / 10;
        int Third = x2 % 10;
        if ((Math.pow(First, 3) + Math.pow(Second, 3) + Math.pow(Third, 3)) == x) {
            provera = true;
    }
        return provera;}

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
        System.out.println("Unesite trocifreni broj: ");
        int number = sc.nextInt();

        boolean checkArmstrong = isArmstrong(number);
        System.out.println(checkArmstrong);
    }

}
