package Nedelja5.Products;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        WeightedProduct wp1 = new WeightedProduct("",0,0);
        SingleProduct sp1 = new SingleProduct("",0,0);
        SubsctriptionService ss1 = new SubsctriptionService("",0,0);
        SinglePurchaseService sps1 = new SinglePurchaseService("",1,0);

        double zbir = 0;
        boolean check = true;
        String ispis = ("");
        while (check) {
            System.out.println("Unesite 1-WeightedProduct, 2-SingleProduct, 3-SubscriptionService, 4-SinglePurchaseService ili 0 da prekinete program");
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();

        if (input == 1) {
            wp1.unos();
            zbir = zbir + wp1.getPrice();
            ispis = ispis  + "\n" + wp1;
        }
        if (input == 2) {
            sp1.unos();
            zbir = zbir + sp1.getPrice();
            ispis = ispis + "\n" +sp1;
        }
        if (input == 3) {
            ss1.unos();
            zbir = zbir + ss1.getPrice();
            ispis = ispis + "\n" + ss1;
        }
        if (input == 4) {
            sps1.unos();
            zbir = zbir + sps1.getPrice();
            ispis = ispis + "\n" + sps1;
        }
        if (input == 0) {
            System.out.println(ispis);
            System.out.println("--------------------------------");
            System.out.println("Vas ukupan racun je: " + zbir + " din");
            check = false;
        }
        }
    }
}
