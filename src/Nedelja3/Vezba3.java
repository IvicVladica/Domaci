package Nedelja3;

import java.util.Scanner;

public class Vezba3 {
    public static void main(String[] args) {
        int[][] niz = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Unesite red " + (i+1) + ", kolonu " + (j+1) + ": ");
                niz[i][j] = sc.nextInt();
            }

        }
        for (int[] row : niz){
            for (int el : row) {
                System.out.print(el + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i<3; i++) {
            for (int j = 0; j<3; j++) {
                sum = sum + niz[i][j];
            }
        }

        System.out.println("Suma je " + sum);
    }
}