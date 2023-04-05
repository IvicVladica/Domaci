package Nedelja1;//Unos je broj sa tastature, i jedan random (0,100) broj (sakriven)
//Izlaz programa:
//skriveni broj = našem ulazu "broj je jednak" skriveni broj != "bro nije j3*.

import java.util.Scanner;

public class Vezba16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj od 0 do 100 ");
        int x = sc.nextInt();

        int y = (int) (Math.random() * 100);

        if (x == y) {
            System.out.println("Broj je jednak");
        } else {
            System.out.println("Broj nije jednak");
        }

    }
}
