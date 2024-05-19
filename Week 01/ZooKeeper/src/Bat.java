public class Bat extends Mammal {
    public Bat() {
        energy = 300;
    }

    public void fly() {
        System.out.println("The bat is airborne!");
        energy -= 50;
        displayEnergy();
    }

    public void eatHumans() {
        System.out.println("The bat eats a human!");
        energy += 25;
        displayEnergy();
    }

    public void attackTown() {
        System.out.println("The bat attacks the town!");
        energy -= 100;
        displayEnergy();
    }
}
