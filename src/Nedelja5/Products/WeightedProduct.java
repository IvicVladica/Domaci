package Nedelja5.Products;

import java.util.Scanner;

public class WeightedProduct extends Product{
    double weight;

    public WeightedProduct(String ProductName, double weight, double Price) {
        super(ProductName, Price);
        this.weight = weight;

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getPrice() {
        return weight * Price;
    }

    public void unos () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite ime artikla: ");
        ProductName = sc.nextLine();
        System.out.println("Unesite tezinu: ");
        weight = sc.nextDouble();
        System.out.println("Unesite cenu: ");
        Price = sc.nextDouble();
    }

    @Override
    public String toString() {
        return (ProductName + " -> " + weight + "kg -> " + Price + "din");
    }
}
