package ProbniTest1;

import java.util.Scanner;

public class Zadatak1 {
    public static int factorial(int x){
        int result = x;
        for (int i=1; i<x; i++){
            result = result * (x-i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Unesite broj: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(factorial(input));
    }

}
