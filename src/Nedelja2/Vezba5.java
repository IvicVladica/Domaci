package Nedelja2;// 3. Написати функцију која проверава да ли је Стринг палиндром

import java.util.Scanner;

public class Vezba5 {
    public static boolean isPalindrom(String input){
        String reverse = "";
        for (int i = input.length()-1; i>=0; i--) {
            reverse = reverse + input.charAt(i);
        }
        if (reverse.equals(input)) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite rec: ");
        String x = sc.next();

        System.out.println(isPalindrom(x));
    }
}

