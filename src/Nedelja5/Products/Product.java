package Nedelja5.Products;

public abstract class Product implements Priceable {
    public String ProductName;
    public double Price;

    public Product (String ProductName, double Price) {
        this.ProductName = ProductName;
        this.Price = Price;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }


    @Override
    public double getPrice() {
        return Price;
    }
}

