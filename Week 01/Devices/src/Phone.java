public class Phone extends Device {

    // Method to make a call
    public void makeCall() {
        int currentBattery = getBattery();
        if (currentBattery >= 5) {
            setBattery(currentBattery - 5);
            System.out.println("You make a call.");
        } else {
            System.out.println("Not enough battery to make a call.");
        }
        displayBatteryLife();
    }

    // Method to play a game
    public void playGame() {
        int currentBattery = getBattery();
        if (currentBattery >= 20) {
            setBattery(currentBattery - 20);
            System.out.println("You play a game.");
        } else {
            System.out.println("Not enough battery to play a game.");
        }
        displayBatteryLife();
    }

    // Method to charge the phone
    public void charge() {
        int currentBattery = getBattery();
        setBattery(Math.min(currentBattery + 50, 100));
        System.out.println("You charge the phone.");
        displayBatteryLife();
    }
}
