package iuh.fit.edu.vn.bai2;

public class Product implements  Component{
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " - " + price + "vnd";
    }
}
