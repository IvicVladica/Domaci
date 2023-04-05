package Nedelja5.Nedelja5_ZadatakNedelja;

public class Main {
    public static void main(String[] args) {

        Complex x = new Complex(5, 2);
        Complex y = new Complex(4,-3);
        System.out.println("Broj 1: " + x);
        System.out.println("Broj 2: " + y);
        System.out.println("Zbir je: " + x.add(y));
        System.out.println(Complex.addS(x,y));
        System.out.println("Razlika je: " + x.subtract(y));
        System.out.println("Proizvod je: " + x.multiply(y));
        System.out.println("Kolicnik je: " + x.divide(y));

    }
}