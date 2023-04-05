package Nedelja3.Nedelja3_ZadaciNedelja;//2. Написати програм који највећу (по збиру) колону, ставља на прво место
//        int[][] matrix = { { 3, 2, 1, 7 },
//                           { 9, 11, 5, 4 },
//                           { 6, 0, 13, 17 },
//                           { 7, 21, 14, 15 } };
//// ... Овде иде ваша магија
//        int[][] result = { { 7, 3, 2, 1 },
//                           { 4, 9, 11, 5 },
//                           { 17, 6, 0, 13 },
//                           { 15, 7, 21, 14 } };

public class Zadatak2 {
    public static int[][] LargestColumn (int[][]input){
        int m = input.length;
        int n = input[0].length;
        int sumColumn = 0;
        int sumMax = 0;
        int [][] result = new int [m][n];
        int [][] temp = new int [m][n];
        int first = 0;
        for (int i=0; i<input.length; i++) {
            sumColumn = 0;
            for (int j = 0; j < input[i].length; j++) {
                sumColumn = sumColumn + input[j][i];
            }
            if (sumColumn > sumMax) {
                sumMax = sumColumn;
                first = i;
            }
        }
            for (int r = 0; r < m; r++) {
                result[r][0] = input[r][first];
                for (int k = 1; k <= first; k++) {
                    result[r][k] = input[r][k-1];
                }
                for (int l = first+1; l < n; l++) {
                    result[r][l] = input[r][l];
                }

            }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 3, 2, 1, 7 },
                          { 9, 11, 5, 4 },
                           { 6, 0, 13, 17 },
                          { 7, 21, 14, 15 } };

        int[][] output = LargestColumn(matrix);
        for (int[] row : output) {
            for (int el : row) {
                System.out.print(el + " ");
            }
            System.out.println();
        }


    }
}
