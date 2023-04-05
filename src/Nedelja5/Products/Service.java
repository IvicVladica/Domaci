package Nedelja5.Products;

public abstract class Service implements Priceable {
    String ServiceName;
    double Price;

    public Service (String ServiceName, double Price) {
        this.ServiceName = ServiceName;
        this.Price = Price;
    }

    @Override
    public double getPrice() {
        return Price;
    }

    public String getServiceName() {
        return ServiceName;
    }

    public void setServiceName(String serviceName) {
        ServiceName = serviceName;
    }
}
