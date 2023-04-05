package Nedelja3.Nedelja3_ZadaciSreda;//1. //Napi²ite Java program za brojanje stringova u kojima je duºina
//       stringa 2 ili vi²e, a prvi i poslednji znak isti sa date liste stringova.
//Stringove uneti sa tastature pomo¢u skenera i unabici u
//       ArrayList strukturu podataka
// Potrebno je napraviti funkciju
//ArrayList : ['abc', 'xyz', 'aba', '1221']
//Expected Result : 2

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak1 {
    public static int ArrayList(String []arr){
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
        String niz [] = new String [input1.length];
        for (int i=0; i<input1.length; i++) {
            niz [i] = input1[i];
        }
        System.out.println(Arrays.toString(niz));
        System.out.println(ArrayList(niz));
    }
}
