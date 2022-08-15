package Nedelja3_ZadaciSreda;//1. //Napisite Java program za brojanje stringova u kojima je duzina
//       stringa 2 ili vise, a prvi i poslednji znak isti sa date liste stringova.
//Stringove uneti sa tastature pomocu skenera i unabici u
//       ArrayList strukturu podataka
// Potrebno je napraviti funkciju
//ArrayList : ['abc', 'xyz', 'aba', '1221']
//Expected Result : 2

import java.util.ArrayList;

import java.util.Scanner;

public class Zadatak1_saArrayListom {
    public static int ArrayList1(ArrayList<String>arr){
        int count = 0;
        for (String element : arr){
            if (element.charAt(0) == element.charAt(element.length()-1) && element.length()>2) {
                count = count + 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite clanove niza: ");
        String input = sc.nextLine();
        String [] input1 = input.split(", ");
        ArrayList<String>niz = new ArrayList<String>();
        for (int i=0; i<input1.length; i++) {
            niz.add(i, input1[i]);
        }
        System.out.println((niz));
        System.out.println(ArrayList1(niz));
    }
}
