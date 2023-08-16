import java.security.SecureRandom;
import java.util.Random;

public class PasswordGenerator {
    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL = "!@#$%^&*()_+-=[]{}|;:,.<>?";

    public static void main(String[] args) {
        int length = 12; // Specify the desired password length

        String password = generatePassword(length);
        System.out.println("Generated Password: " + password);
    }

    public static String generatePassword(int length) {
        String allCharacters = LOWER + UPPER + DIGITS + SPECIAL;
        Random random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(allCharacters.length());
            password.append(allCharacters.charAt(index));
        }

        return password.toString();
    }
}