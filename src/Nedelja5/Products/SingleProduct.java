package Nedelja5.Products;

import java.util.Scanner;

public class SingleProduct extends Product{

    int quantity;

    public SingleProduct(String ProductName, double Price, int quantity) {
        super(ProductName, Price);
        this.quantity = quantity;
}

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getPrice() {
        return quantity * Price;
    }
    public void unos () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite ime artikla: ");
        ProductName = sc.nextLine();
        System.out.println("Unesite kolicinu: ");
        quantity = sc.nextInt();
        System.out.println("Unesite cenu: ");
        Price = sc.nextDouble();
    }
    @Override
    public String toString() {
        return (ProductName + " -> " + quantity + "kom -> " + Price + "din");
    }
}
