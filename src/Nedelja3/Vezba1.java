package Nedelja3;//Unesi ArrayList n brojeva
//dok se ne prekine "stop"
//naći srednju vrenost elemenata avrg = sumOfElements / numberOfElements
// int tipa

import java.util.ArrayList;
import java.util.Scanner;

public class Vezba1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite clanove niza, za prekid ukucajte stop");
        String x = "";
        double sum = 0;
        double avg = 0;
        ArrayList<Double>niz = new ArrayList<Double>();
        while (true) {
            x = sc.nextLine();
            if (x.equals("stop")) {break;}
            double y = Double.parseDouble(x);
            niz.add(y);
        }
        for (int i=0; i<niz.size(); i++) {
            sum = sum + niz.get(i);
        }
        System.out.println(niz);
        avg = sum/niz.size();
        System.out.println(avg);

    }
}
