package Nedelja5.Products;

public class Proba {
    public static void main(String[] args) {
    WeightedProduct wp2 = new WeightedProduct("abc", 5, 5);
    wp2.unos();
        System.out.println(wp2.toString());
        System.out.println(wp2.getPrice());
}
}
