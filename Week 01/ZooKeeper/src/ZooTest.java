public class ZooTest {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();
        Bat bat = new Bat();

        // Test the Gorilla class
        gorilla.throwSomething();
        gorilla.throwSomething();
        gorilla.eatBananas();
        gorilla.throwSomething();
        gorilla.eatBananas();
        gorilla.climb();

        // Test the Bat class
        bat.attackTown();
        bat.attackTown();
        bat.attackTown();
        bat.eatHumans();
        bat.eatHumans();
        bat.fly();
        bat.fly();
    }
}
