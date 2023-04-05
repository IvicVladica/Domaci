package Nedelja2.Nedelja2_ZadaciSreda;//3. (БОНУС) Проширити задатак са Армстронговим бројевима на СВЕ бројеве
//        Број је Армстронгов ако је једнак збиру n-тих степена његових цифара
//        Где је n број цифара тог броја
//        https://mathworld.wolfram.com/NarcissisticNumber.html
//        isArmstrong(371) -> true
//        isArmstrong(5) -> true (5¹ = 5)
//        isArmstrong(1634) -> true (јер 1⁴ + 6⁴ + 3⁴ + 4⁴ = 1634)
//        isArmstrong(1625) -> false

import java.util.Scanner;

public class Zadatak3 {
    public static boolean isArmstrong(String number) {
        double numberInt = Integer.parseInt(number);
        boolean check = false;
        double zbirStepena = 0;
        for (int i = 0; i < number.length(); i++) {
            char nextNumber = (number.charAt(i));
            String nextNumberString = String.valueOf(nextNumber);
            int nextNumberInt = Integer.parseInt(nextNumberString);
            double nextNumberPow = Math.pow(nextNumberInt, number.length());
            zbirStepena = zbirStepena + nextNumberPow;
        }
        if (zbirStepena == numberInt)
            check = true;
        return check;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        String x = sc.next();

        System.out.println(isArmstrong(x));
    }
}

