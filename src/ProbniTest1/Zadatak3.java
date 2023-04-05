package ProbniTest1;

import java.util.Arrays;

public class Zadatak3 {
    public static int [] Incremented (int []niz, int x){

        for (int i=0; i<niz.length; i++) {
         niz[i] = (niz[i]+x);
        }
        return niz;
    }

    public static void main(String[] args) {
        int[] nizProba = {1,2,3,4};
        int broj = 3;
        System.out.println(Arrays.toString(Incremented(nizProba, broj)));

    }
}

