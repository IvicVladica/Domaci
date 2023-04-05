package Nedelja3.Nedelja3_ZadaciNedelja;//1. Написати функцију која прима матрицу (2Д низ) и враћа највећи ред (по збиру)
//        Hint: Сетите се како смо радили највећи елемент низа
//        int[][] matrix = { { 3, 2, 1, 7 },
//        { 9, 11, 5, 4 },
//        { 6, 0, 13, 17 },
//        { 7, 21, 14, 15 } };
//        largestRow(matrix); // Враћа - [7, 21, 14, 15]


import java.util.Arrays;

public class Zadatak1 {
    public static int[] largestRow (int[][]input){
        int sumRow = 0;
        int sumMax = 0;
        int n=input[0].length;
        int[] result = new int[n];
        for (int [] row : input) {
            sumRow = 0;
            for (int el : row){
                sumRow = sumRow + el;
            }
            if (sumRow>sumMax) {
                sumMax=sumRow;
                result = row;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 3, 2, 1, 7 },
                           { 9, 11, 5, 4 },
                           { 6, 0, 13, 17 },
                           { 7, 21, 14, 15 } };


        System.out.println(Arrays.toString(largestRow(matrix)));

    }
}
