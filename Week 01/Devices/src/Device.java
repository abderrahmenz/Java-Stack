public class Device {
    // Member variable
    private int battery;

    // Constructor
    public Device() {
        this.battery = 100;
    }

    // Method to display battery life
    public void displayBatteryLife() {
        System.out.println("Battery remaining: " + battery);
    }

    // Getter for battery (to be used in the Phone class)
    public int getBattery() {
        return battery;
    }

    // Setter for battery (to be used in the Phone class)
    public void setBattery(int battery) {
        this.battery = battery;
    }
}
