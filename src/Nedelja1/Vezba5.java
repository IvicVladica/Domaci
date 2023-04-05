package Nedelja1;

import java.util.Scanner;

public class Vezba5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        int year = day / 365;

           day = day % 365;

        int week = day / 7 ;

           day = day % 7;

        int singleday = day;

        System.out.println("Godina" + year + "Nedelja" + week + "Dani" + singleday);


    }
}
