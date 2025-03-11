package iuh.fit.edu.vn.bai2;

public class CompositePattern {
    public static void main(String[] args) {
        CoffeeShop coffeeShop = new CoffeeShop("ca phe Moc");

        // Tạo các sản phẩm
        Product coffee = new Product("Ca phe Den", 25000);
        Product milkCoffee = new Product("Ca phe sua", 30000);
        Product tea = new Product("Tra", 20000);
        Product milkTea = new Product("Tra sua", 35000);
        Product water = new Product("Nuoc suoi", 10000);
        Product cake = new Product("Banh ngot", 15000);

        // Tạo bàn 1 và thêm sản phẩm
        Table table1 = new Table("01");
        table1.addItem(coffee);
        table1.addItem(tea);
        table1.addItem(cake);

        // Tạo bàn 2 và thêm sản phẩm
        Table table2 = new Table("02");
        table2.addItem(milkCoffee);
        table2.addItem(milkTea);

        // Tạo bàn 3 và thêm sản phẩm
        Table table3 = new Table("03");
        table3.addItem(water);
        table3.addItem(cake);
        table3.addItem(milkTea);

        // Thêm các bàn vào quán
        coffeeShop.addTable(table1);
        coffeeShop.addTable(table2);
        coffeeShop.addTable(table3);

        // In hóa đơn cho từng bàn
        table1.printBill();
        System.out.println();
        table2.printBill();
        System.out.println();
        table3.printBill();
        System.out.println();

        // In báo cáo doanh thu của quán
        coffeeShop.printRevenue();
    }
}
