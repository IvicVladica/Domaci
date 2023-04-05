package Nedelja1;

import java.util.Scanner;

public class Vezba6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String jedinica = sc.nextLine();
        float Vrednost = sc.nextFloat();

        if(jedinica.equals("C")) {
            double rezultat = Vrednost * 1.8 + 32;
            System.out.println(rezultat);
        }
        else {
            if(jedinica.equals("F")) {
                double rezultat = (Vrednost - 32)/1.8;
                System.out.println(rezultat);
            }

            else {
                System.out.println("Neispravan unos");
            }
        }
        };




    }


