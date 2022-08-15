package Nedelja3_ZadaciSreda;//3. //Napisite Java funkciju koja vraca nasumicni element iz
//        ArrayListe koja se unosi pomocu skenera

import java.util.Scanner;

public class Zadatak3 {
    public static String randomArr (String[]x){
        int n = (int) (x.length * Math.random());
        return x[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite niz: ");
        String input = sc.nextLine();
        String [] input1 = input.split(", ");
        String [] niz = new String[input1.length];
        for (int i=0; i< input1.length; i++) {
            niz[i] = input1[i];
        }

        System.out.println(randomArr(niz));
    }
}