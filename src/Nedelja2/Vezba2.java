package Nedelja2;

import java.util.Scanner;

public class Vezba2 {

    public static String repeat(String str, int n) {
        String res = " ";
        for (int i=0; i < n; i ++) {
            res += str;
        }
        return res;
    }

    public static void printMultiple (String a, int x) {
        for (int j = 1; j == x; j++) {
            System.out.println("#");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sym = sc.next();
        int a = sc.nextInt();
        int b = sc.nextInt();

        String row = repeat(sym, a); // ##### -> Ако је а = 5

        printMultiple(row, b);
    }
}
