package Nedelja1.Nedelja1_ZadaciNedelja;//2. Корисник може унети n бројева са тастатуре, програм се зауставља када
//        користин напише команду “stop”:
//        ● Програм проверава сваки унос корисника (сваки број који корисник
//        унесе);
//        ● Ако је број који је корисник унео дељив са 2, програм исписује “Broj je
//        deljiv sa 2”;
//        ● Ако број није дељив са 2, програм исписује “Broj nije deljiv sa 2”.
//        Пример улаза и излаза.
//        Улаз:
//        нпр. користик уноси 3 броја: 33, 20, 26, “stop”
//        Излаз:
//        “Broj nije deljiv sa 2”
//        “Broj je deljiv sa 2”
//        “Broj je deljiv sa 2”

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean Check = true;

        while (Check) {
            System.out.println("Unesite broj");
            int Number = sc.nextInt();
            if (Number %2 == 0) {
                System.out.println("Broj je deljiv sa 2");}
                else {
                    System.out.println("Broj nije deljiv sa 2");}

            System.out.println("Unesite stop ako zelite da prekinete (za nastavak ukucajte bilo koji karakter)");
                    String ProveraStop = sc.next();
                    if (ProveraStop.equals("stop")) {Check = false;}
        }

        }

    }


