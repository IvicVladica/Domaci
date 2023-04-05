package CodeWars;//Complete the function that takes two integers (a, b, where a < b) and return an array of all integers between the input parameters, including them.
//
//        For example:
//
//        a = 1
//        b = 4
//        --> [1, 2, 3, 4]

import java.util.Arrays;
import java.util.Scanner;

public class CodeWars6 {
    public static int [] Array (int x, int y) {
        int lenght = y-x+1;
        int [] niz = new int [lenght];
        for (int i=0; i<lenght; i++) {
            niz [i] = x+i;
        }
        return niz;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int [] arr = Array(a,b);
        System.out.println(Arrays.toString(arr));
    }



}
