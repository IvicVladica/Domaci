package Nedelja2.Nedelja2_ZadaciNedelja;//3. Пребројати колико негативних бројева има у низу од локације1 до локације2.
//        ● Корисник прави низ карактера у ком су измешани позитивни и негативни
//        бројеви;
//        ● Корисник уноси локацију1 и локацију2;
//        ● Програм исписује колико негативних бројева имамо у низу од локације1
//        до локације2.
//        Пример улаза и излаза.
//        Улаз:
//        низ - 1,2,3,-6,-3,-2,5,8,-6,-2,-6
//        “Локација1” - 2
//        “Локација2” - 5
//        Излаз:
//        “Од индекса 2 до индеска 5 налазе се 3 негативна броја.”

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Koliko zelite clanova niza?");
        int broj = sc.nextInt();
        int[] niz = new int[broj];

        for (int l = 0; l < broj; l++) {
            System.out.print("Unesite " + (l + 1) + ". broj: ");
            niz[l] = sc.nextInt();
        }
        System.out.println("Uneti niz je " + Arrays.toString(niz));
        System.out.print("Unesite lokaciju 1: ");
        int l1 = sc.nextInt();
        System.out.print("Unesite lokaciju 2: ");
        int l2 = sc.nextInt();
        int count = 0;
        int pos1 = 0;
        int pos2 = 0;

        for (int j=0; j< niz.length; j++) {
            if (niz[j] == l1) {
                pos1 = j;
            }
        }
        for (int k=0; k<niz.length; k++) {
            if (niz[k] == l2) {
                pos2 = k;
            }
        }

        for (int i=pos1; i<pos2; i++) {
            if (niz[i]<0) {
                count = count +1;
            }
        }
        System.out.println("Od indeksa " + l1 + " do indeksa " +l2 + " nalaze se " + count + " negativna broja");
    }
}
