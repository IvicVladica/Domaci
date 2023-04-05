package CodeWars;//Return the number (count) of vowels in the given string.
//
//        We will consider a, e, i, o, u as vowels for this Kata (but not y).
//
//        The input string will only consist of lower case letters and/or spaces.

import java.util.Scanner;

public class CodeWars8 {
    public static int vowelCounter(String a){
        int count = 0;
        for (int i=0; i<(a.length()); i++){
            if (a.charAt(i) == ('a') || a.charAt(i) == ('e') || a.charAt(i) == ('i') || a.charAt(i) == ('o') || a.charAt(i) == ('u')){
                count = count + 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite rec");
        String input = sc.nextLine();
        System.out.println(vowelCounter(input));
    }
}
