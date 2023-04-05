package ProbniTest1;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

        System.out.println("Koliko brojeva zelite da unesete? ");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        double y = sc.nextDouble();
        double sabiranje = y;
        double oduzimanje = y;
        for (int i=1; i<count; i++) {
            double x = sc.nextInt();
            sabiranje = sabiranje + x;
            oduzimanje = oduzimanje - x;
        }
        System.out.println("Unesite 1 za sabiranje, 2 z oduzimanje");
        int choose = sc.nextInt();
        if (choose==1) {
            System.out.println(sabiranje);
        }
        if (choose==2) {
            System.out.println(oduzimanje);
        }

    }
}
