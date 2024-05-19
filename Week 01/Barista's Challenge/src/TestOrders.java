public class TestOrders {
    public static void main(String[] args) {

        Item item1 = new Item("mocha", 3.5);
        Item item2 = new Item("latte", 4.0);
        Item item3 = new Item("drip coffee", 2.5);
        Item item4 = new Item("cappuccino", 3.0);

        Order order1 = new Order();
        Order order2 = new Order();

        Order order3 = new Order("Cindhuri");
        Order order4 = new Order("Jimmy");
        Order order5 = new Order("Noah");

        order1.addItem(item1);
        order1.addItem(item2);

        order2.addItem(item3);
        order2.addItem(item4);

        order3.addItem(item1);
        order3.addItem(item4);

        order4.addItem(item2);
        order4.addItem(item3);

        order5.addItem(item4);
        order5.addItem(item2);
        
        order1.setReady(true);
        order3.setReady(true);

        System.out.println(order1.getStatusMessage());
        System.out.println(order2.getStatusMessage());
        System.out.println(order3.getStatusMessage());
        System.out.println(order4.getStatusMessage());
        System.out.println(order5.getStatusMessage());

        System.out.println(order1.getOrderTotal());
        System.out.println(order2.getOrderTotal());
        System.out.println(order3.getOrderTotal());
        System.out.println(order4.getOrderTotal());
        System.out.println(order5.getOrderTotal());

        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();
    }
}
