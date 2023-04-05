package CodeWars;//In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.
//
//        Examples
//        highAndLow("1 2 3 4 5")  // return "5 1"
//        highAndLow("1 2 -3 4 5") // return "5 -3"
//        highAndLow("1 9 3 4 -5") // return "9 -5"


import java.util.Arrays;
import java.util.Scanner;

public class CodeWars2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite niz: ");
        String input = sc.nextLine();

        String [] s =  input.split(" ");   //odvaja prazna mesta i pravi novi string
        System.out.println(Arrays.toString(s));
        int [] out = new int[s.length]; // pravi novi niz koji ima broj clanova kolika je duzina stringa
        for (int i=0; i<s.length; i++){
            out [i] = Integer.parseInt(s[i]);  // dodeljuje svaki broj iz stringa nizu, redom
        }
        int Max = out[0];
        int Min = out[0];

        for (int j=0; j < out.length; j++) {
            if (out[j] > Max) {
                Max = out[j];
            }
            if (out[j] < Min) {
                Min = out[j];
            }
        }

        System.out.println(Max + " " + Min);

    }
}
