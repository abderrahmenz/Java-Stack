import java.util.ArrayList;

class Item {
    String name;
    double price;

    // Constructor (optional)
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class Order {
    String name;
    ArrayList<Item> items = new ArrayList<>();
    double total = 0.0;
    boolean ready = false;

    // Constructor (optional)
    public Order(String name) {
        this.name = name;
    }

    // Add an item to the order
    public void addItem(Item item) {
        items.add(item);
        total += item.price;
    }

    // Mark the order as ready
    public void markReady() {
        ready = true;
    }
}

public class FirstClass {
    public static void main(String[] args) {
        // Menu items
        Item item1 = new Item("mocha", 3.5);
        Item item2 = new Item("latte", 4.0);
        Item item3 = new Item("drip coffee", 2.5);
        Item item4 = new Item("cappuccino", 3.0);

        // Order variables
        Order order1 = new Order("Cindhuri");
        Order order2 = new Order("Jimmy");
        Order order3 = new Order("Noah");
        Order order4 = new Order("Sam");

        // Add items to orders
        order2.addItem(item1); // Jimmy's mocha
        order3.addItem(item4); // Noah's cappuccino
        order4.addItem(item2); // Sam's latte
        order4.addItem(item2); // Sam's additional latte

        // Mark orders as ready
        order1.markReady(); // Cindhuri's order
        order2.markReady(); // Jimmy's order

        // Print order details
        System.out.println("Order Details:");
        System.out.printf("Name: %s, Total: %.2f, Ready: %s\n", order1.name, order1.total, order1.ready);
        System.out.printf("Name: %s, Total: %.2f, Ready: %s\n", order2.name, order2.total, order2.ready);
        System.out.printf("Name: %s, Total: %.2f, Ready: %s\n", order3.name, order3.total, order3.ready);
        System.out.printf("Name: %s, Total: %.2f, Ready: %s\n", order4.name, order4.total, order4.ready);
    }
}
