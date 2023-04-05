package Nedelja3;

import java.util.Scanner;

public class Vezba4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        final int M = 3;
        final int N = 3;
        int [][]niz = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("Unesite red " + (i+1) + ", kolonu " + (j+1) + ": ");
                niz[i][j] = sc.nextInt();
            }
        }
        for (int[] row : niz) {
            for (int el : row) {
                System.out.print(el + " ");
            }
            System.out.println();
        }
            for (int i = 0; i < M; i++) {
                sum = sum + niz[i][i];
            }
            System.out.println("Suma dijagonale je: " + sum);
        }
    }

