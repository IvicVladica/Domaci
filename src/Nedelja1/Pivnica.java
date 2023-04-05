package Nedelja1;

import java.util.Scanner;

public class Pivnica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Koliko imate godina");
        int godine = sc.nextInt();
        if (godine > 0) {

            if (godine > 18) {
                System.out.println("Dobrodosli!");
            }
            else {
                System.out.println("Nemate dovoljno godina");
            }
        } else {
            System.out.println("Pogresan unos!");
        }
    }


}