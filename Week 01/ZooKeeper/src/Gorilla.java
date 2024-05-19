public class Gorilla extends Mammal {
    public void throwSomething() {
        System.out.println("The gorilla throws something!");
        energy -= 5;
        displayEnergy();
    }

    public void eatBananas() {
        System.out.println("The gorilla eats bananas!");
        energy += 10;
        displayEnergy();
    }

    public void climb() {
        System.out.println("The gorilla climbs a tree!");
        energy -= 10;
        displayEnergy();
    }
}
