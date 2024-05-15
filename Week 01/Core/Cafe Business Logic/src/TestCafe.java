import java.util.ArrayList;

public class TestCafe {
    public static void main(String[] args) {
        // Instantiate an instance of CafeUtil
        CafeUtil appTest = new CafeUtil();

        // Test getStreakGoal method:
        System.out.println("-----Streak Goal Test-----\nPurchases needed by week 10: " + appTest.getStreakGoal());

        // Test getOrderTotal method:
        double[] itemPrices = { 3.5, 4.25, 5.75 };
        System.out.println("Order total: $" + appTest.getOrderTotal(itemPrices));

        // Test displayMenu method:
        ArrayList<String> menuItems = new ArrayList<String>();
        menuItems.add("Drip Coffee");
        menuItems.add("Cappuccino");
        menuItems.add("Latte");
        menuItems.add("Mocha");

        System.out.println("\n-----Menu Display Test-----");
        appTest.displayMenu(menuItems);

        // Test addCustomer method:
        ArrayList<String> customers = new ArrayList<String>();
        System.out.println("\n-----Add Customer Test-----");
        appTest.addCustomer(customers);
    }
}
