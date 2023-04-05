package Dodatni;//3. Написати програм који исписује следеће облике:
//        Квадрат
//        N = 4 N = 3
//        #### ###
//        #### ###
//        #### ###
//        ####

import java.util.Scanner;

public class Dodatni3 {
    public static void kvadrat(int x){
        for (int i=1; i<=x; i++){
            System.out.println("#".repeat(x));
        }
    }

//   Правоугаоник
//    a = 5 b = 4    a = 2 b = 6
//    #####          ##
//    #####          ##
//    #####          ##
//    #####          ##
//                   ##
//                   ##

    public static void pravoguaonik(int x, int y){
        for (int j=1; j<=y; j++){
            System.out.println("#".repeat(x));
        }
    }
//*Марио пирамида - Бонус задатак
//    N = 5
//            # #
//           ## ##
//          ### ###
//         #### ####
//        ##### #####

    public static void mario(int x) {
        for (int i = 1; i <= x; i++) {
            System.out.println(" ".repeat(x - i) + "#".repeat(i) + " " + "#".repeat(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite k-kvadrat, p-pravoguaonik,m-mario piramida: ");
        String input = sc.next();
        if (input.equals("k")) {
            System.out.println("Unesite stranicu kvadrata: ");
            int x = sc.nextInt();
            kvadrat(x);
        }
        if (input.equals("p")) {
            System.out.println("Unesite stranicu a pravougaonika: ");
            int a = sc.nextInt();
            System.out.println("Unesite stranicu b pravougaonika: ");
            int b = sc.nextInt();
            pravoguaonik(a,b);
        }
        if (input.equals("m")) {
            System.out.println("Unesite broj: ");
            int y = sc.nextInt();
            mario(y);
        }
        if (!input.equals("k") && !input.equals("p") && !input.equals("m")) {
            System.out.println("Neodgovarajuci unos!");
        }

        }
    }

