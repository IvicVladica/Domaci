package Dodatni;//2. Написати програм који исписује збир свих унетих бројева док се не унесе 0
//        Напомена: Није неопходан детаљан испис као испод, али је пожељан
//        Пример тока програма:
//        Унесите број: 5
//        Збир је: 5 , Унесите следећи број или 0 да изађете из програма: 3
//        Збир је: 8 , Унесите следећи број или 0 да изађете из програма: -7
//        Збир је: 1 , Унесите следећи број или 0 да изађете из програма: 0
//        Укупан збир је 1

import java.util.Scanner;

public class Dodatni2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int sum = sc.nextInt();
        System.out.print("Zbir je: " + sum + ", Unesite sledeci broj ili 0 da izadjete iz programa: ");
        int nextInput = sc.nextInt();
        while (nextInput != 0) {
            sum = sum + nextInput;
            System.out.print("Zbir je: " + sum + ", Unesite sledeci broj ili 0 da izadjete iz programa: ");
            nextInput = sc.nextInt();
        }
        System.out.println("Ukupan zbir je " + sum);
    }
}