package RandomString;

import java.util.Random;

public class RandomStringgenrate {
    public static String generateRandomString(int length) {
        String characterSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder randomString = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characterSet.length());
            char randomChar = characterSet.charAt(randomIndex);
            randomString.append(randomChar);
        }

        return randomString.toString();
    }

    public static void main(String[] args) {
        int length = 10; // Change this to your desired length
        String randomString = generateRandomString(length);
        System.out.println("Random String: " + randomString);
    }
}
