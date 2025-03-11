package iuh.fit.edu.vn.bai2;

import java.util.ArrayList;
import java.util.List;

public class Table implements  Component{
    private String tableId;
    private List<Component> items = new ArrayList<>();

    public Table(String tableId) {
        this.tableId = tableId;
    }

    public void addItem(Component item) {
        items.add(item);
    }

    public void removeItem(Component item) {
        items.remove(item);
    }

    @Override
    public double getPrice() {
        double totalPrice = 0;
        for (Component item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    @Override
    public String getName() {
        return "Ban " + tableId;
    }

    public List<Component> getItems() {
        return items;
    }

    public void printBill() {
        System.out.println("------ HOA DON ------");
        System.out.println(getName());
        System.out.println("--------------------");
        for (Component item : items) {
            System.out.println(item);
        }
        System.out.println("--------------------");
        System.out.println("Tong tien: " + getPrice() + "vnd");
        System.out.println("--------------------");
    }
}
