package CodeWars;

import java.util.Arrays;
import java.util.Scanner;

public class CodeWars1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        String StX = String.valueOf(x);
        String StY = String.valueOf(y);
        int sum = 0;
        int lx = StX.length();
        int ly = StY.length();
        int b1=0;
        String result = "";
        for (int i=0; i<StX.length(); i++){
            int a = StX.charAt(i) - '0';
            int b = StY.charAt(i) - '0';
            if (i == lx) {
                for(int j=lx-1; j<ly; j++) {
                    b1 = StY.charAt(j);
                }
            }
            sum = a+b;
            result = result + " " + sum + " " + b1;
        }
        System.out.println(result);
        }
}





