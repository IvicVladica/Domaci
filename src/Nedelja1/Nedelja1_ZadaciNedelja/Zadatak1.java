package Nedelja1.Nedelja1_ZadaciNedelja;
//Корисник се шета помоћу тастера (w-горе, a- лево, s-доле, d-десно);
//        ● Програм памти колико је корисник пута ишао горе, лево, доле и десно;
//        ● Програм се зауставља ако корисник унесе било који карактер сем
//        (w,s,a,d);
//        ● На крају програм исписује број корисникових корака ка свим странама.
//        Пример улаза и излаза.
//        Улаз:
//        w
//        w
//        s
//        a
//        a
//        d
//        x
//        Излаз:
//        “Корисник је прошао 2 корака на горе, 1 корак на доле, 2 корака лево и 1
//        корак десно”

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int CountUp = 0;
        int CountDown = 0;
        int CountLeft = 0;
        int CountRight = 0;
        boolean Check = true;

        System.out.println("Unesite neki od simbola - w-gore, s- dole, a-levo, d-desno");

        while (Check) {

            String Symbol = sc.next();

            switch (Symbol) {
                case "w": CountUp = CountUp + 1;break;
                case "a": CountLeft = CountLeft + 1;break;
                case "s": CountDown = CountDown + 1;break;
                case "d": CountRight = CountRight + 1;break;
                default: Check = false;break;

            }
        }
            System.out.println("Korisnik je presao " + CountUp + " koraka na gore, " + CountDown + " koraka na dole, " + CountLeft + " koraka na levo i " + CountRight + " Koraka na desno");
        }

    }

