package Nedelja1;

import java.util.Scanner;
public class Vezba7 {
    public static void main(String[] args) {
        System.out.println("Unesite broj");
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();

        if (Number % 5 == 0 && Number % 11 == 0)
        {
            System.out.println("Broj je deljiv sa 5 i 11");}

            else if (Number % 11 == 0) {
                System.out.println("Broj je deljiv sa 11");
            }

            else if (Number % 5 == 0) {
                System.out.println("Broj je deljiv sa 5");
            }
            else {System.out.println("Broj nije deljiv sa 5 i 11");}
        }}






