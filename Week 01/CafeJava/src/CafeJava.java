public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app.
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready. ";
        String displayTotalMessage = "Your total is $";

        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffee = 2.5;
        double latte = 3.5;
        double cappuccino = 4.5;

        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Sam";
        String customer4 = "Jimmy";
        String customer5 = "Noah";

        // Order completions (add yours below)
        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
        boolean isReadyOrder5 = true;

        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1 + readyMessage + displayTotalMessage + dripCoffee);
        // ** Your customer interaction print statements will go here ** //
        if(isReadyOrder5) {
            System.out.print(generalGreeting + customer5 + readyMessage + displayTotalMessage + cappuccino + "\n");
        }
        else {
            System.out.print(pendingMessage);
        }
        System.out.print(generalGreeting + customer3 + displayTotalMessage + (latte *2) + "\n");
        if(isReadyOrder3) {
            System.out.print(pendingMessage);
        }
        System.out.print(generalGreeting + customer4 + displayTotalMessage + latte);
    }
}
