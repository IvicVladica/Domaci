package CodeWars;//Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contain any char.
//
//        Examples input/output:
//
//        XO("ooxx") => true
//        XO("xooxx") => false
//        XO("ooxXm") => true
//        XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
//        XO("zzoo") => false

import java.util.Locale;
import java.util.Scanner;

public class CodeWars4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite string");
        String input1 = sc.nextLine();
        String input = input1.toLowerCase(Locale.ROOT);
        boolean check = false;
        int sumX = 0;
        int sumO = 0;
        for (int i=0; i<input.length(); i++){
            if (input.charAt(i) == 'x') {
                sumX = sumX + 1;
            }
        }
        for (int j=0; j<input.length(); j++) {
            if (input.charAt(j) == 'o') {
                sumO = sumO + 1;
            }
        }
        if (sumX == sumO) {
            check = true;
        }
        System.out.println(check);
    }
}
