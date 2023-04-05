package Nedelja4.Nedelja4_ZadaciNedelja;

public class MainBoca {

    public static void main(String[] args) {
        Boca b1 = new Boca(1.5);
        VinskaBoca vb1 = new VinskaBoca(0.75, "Merlot");
        RonilackaBoca rb1 = new RonilackaBoca(20, 45);
        VinskaBoca vb2 = new VinskaBoca(1.5, "Moet magnum");
        System.out.println(b1);
        System.out.println(vb1);
        System.out.println(rb1);
        System.out.println(vb2);
        result(b1.zapremina, vb2.zapremina);
    }
     static void result(double x, double y) {
        if (x == y) {
            System.out.println("Jednake zapremine");
        } else {
            System.out.println("Nisu jednake zapremine");
        }
    }

}
