package Nedelja5.Products;

import java.util.Scanner;

public class SubsctriptionService extends Service{
    double period;
    public SubsctriptionService(String ServiceName, double period, double Price) {
        super(ServiceName,Price);
        this.period = period;
    }
    public void unos () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite naziv usluge: ");
        ServiceName = sc.nextLine();
        System.out.println("Unesite period u mesecima: ");
        period = sc.nextDouble();
        System.out.println("Unesite cenu za 1 mesec: ");
        Price = sc.nextDouble();
    }
    @Override
    public double getPrice() {
        return Price * period;
    }
    @Override
    public String toString() {
        return (ServiceName + " za period od " + period + " meseci -> " + Price + "din");
    }
}
