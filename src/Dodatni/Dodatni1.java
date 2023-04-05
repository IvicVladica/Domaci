package Dodatni;//1. Написати збир целих бројева од N до M (Укључујући оба)
//        N и M се уносе са тастатуре
//        Напомена: N може бити и мање од M, видети Пример2
//        Пример1:
//        Корисник уноси: 5 11
//        Испис: 56 (5 + 6 + 7 + 8 + 9 + 10 + 11)
//        Пример2:
//        Корисник уноси: 11 8
//        Испис: 38

import java.util.Scanner;

public class Dodatni1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite prvi broj: ");
        int x = sc.nextInt();
        System.out.println("Unesite drugi broj: ");
        int y = sc.nextInt();
        if (x>y) {
            int temp = x;
            x = y;
            y= temp;
        }
        int sum = 0;
        for (int i=x; i<=y; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

}
