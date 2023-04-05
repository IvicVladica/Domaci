package Nedelja5.Products;

import java.util.Scanner;

public class SinglePurchaseService extends Service{
    double period;
    public SinglePurchaseService(String ServiceName, double period, double Price) {
        super(ServiceName,Price);
        this.period = 1;
    }
    public void unos () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite naziv operatera: ");
        ServiceName = sc.nextLine();
        System.out.println("Unesite iznos dopune: ");
        Price = sc.nextDouble();
    }
    @Override
    public double getPrice() {
        return Price;
    }
    @Override
    public String toString() {
        return (ServiceName + " dopuna -> " + Price + " din");
    }
}

