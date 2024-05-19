import java.util.Arrays;
import java.util.Random;

public class FirstClass {

    public static int[] getTenRolls() {
        Random random = new Random();
        int[] rolls = new int[10];
        for (int i = 0; i < 10; i++) {
            rolls[i] = random.nextInt(20) + 1; // nextInt(20) gives 0-19, +1 makes it 1-20
        }
        return rolls;
    }

    public static char getRandomLetter() {
        Random random = new Random();
        char[] letters = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int index = random.nextInt(26); // 0-25 for 26 letters
        return letters[index];
    }

    public static String generatePassword() {
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            password.append(getRandomLetter());
        }
        return password.toString();
    }

    public static String[] getNewPasswordSet(int length) {
        String[] passwordSet = new String[length];
        for (int i = 0; i < length; i++) {
            passwordSet[i] = generatePassword();
        }
        return passwordSet;
    }

    public static void main(String[] args) {
        // Example usage:
        System.out.println("Ten Rolls: " + Arrays.toString(getTenRolls()));
        System.out.println("Random Letter: " + getRandomLetter());
        System.out.println("Generated Password: " + generatePassword());
        System.out.println("New Password Set of Length 5: " + Arrays.toString(getNewPasswordSet(5)));
    }
}
