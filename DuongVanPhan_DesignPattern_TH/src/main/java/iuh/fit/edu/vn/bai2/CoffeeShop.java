package iuh.fit.edu.vn.bai2;

import java.util.ArrayList;
import java.util.List;

public class CoffeeShop {
    private String name;
    private List<Table> tables = new ArrayList<>();

    public CoffeeShop(String name) {
        this.name = name;
    }

    public void addTable(Table table) {
        tables.add(table);
    }

    public void removeTable(Table table) {
        tables.remove(table);
    }

    public double getTotalRevenue() {
        double totalRevenue = 0;
        for (Table table : tables) {
            totalRevenue += table.getPrice();
        }
        return totalRevenue;
    }

    public String getName() {
        return name;
    }

    public List<Table> getTables() {
        return tables;
    }

    public void printRevenue() {
        System.out.println("=== BAO CAO DOANH THU ===");
        System.out.println("Quan: " + name);
        System.out.println("========================");
        for (Table table : tables) {
            System.out.println(table.getName() + ": " + table.getPrice() + "đ");
        }
        System.out.println("========================");
        System.out.println("ToONG DOANH THU: " + getTotalRevenue() + "đ");
        System.out.println("========================");
    }
}
