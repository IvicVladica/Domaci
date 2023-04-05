package Nedelja2.Nedelja2_ZadaciSreda;//Trolls are attacking your comment section!
//
//        A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.
//
//        Your task is to write a function that takes a string and return a new string with all vowels removed.
//
//        For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".
//
//        Note: for this kata y isn't considered a vowel.

//  3. https://www.codewars.com/kata/52fba66badcd10859f00097e/java

import java.util.Scanner;

public class Zadatak5 {
    public static String vowelRemove (String input) {
        String result = "";
        char suglasnik = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != 'a' && input.charAt(i) != 'e' && input.charAt(i) != 'i'&& input.charAt(i) != 'o'&& input.charAt(i) != 'u')  {
                result = result + input.charAt(i);
             }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite recenicu: ");
        String x = sc.nextLine();

        System.out.println(vowelRemove(x));
    }
}
