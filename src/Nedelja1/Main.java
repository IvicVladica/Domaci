package Nedelja1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite broj dana");
        int brdana = sc.nextInt();
        if (brdana <= 5) {
            System.out.println("Radni dan"
            );

        } else {
            System.out.println("Vikend");

        }
    }}


