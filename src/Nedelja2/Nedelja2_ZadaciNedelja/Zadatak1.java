package Nedelja2.Nedelja2_ZadaciNedelja;//1. Написати програм окреће реченицу наопако
//        ● Корисник уноси са тастатуре стринг;
//        ● Програм пролази кроз стринг и окреће стринг наопако.
//        Пример улаза и излаза.
//        Улаз:
//        “This is Sparta!.”
//        Излаз:
//        “.!atrapS si sihT”

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        System.out.println("Unesite recenicu: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String reverse = "";
        for (int i=input.length()-1; i>=0; i--) {
            reverse = reverse + input.charAt(i);
        }
        System.out.println(reverse);
    }

}
