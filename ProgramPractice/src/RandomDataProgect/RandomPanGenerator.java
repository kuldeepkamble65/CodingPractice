package RandomDataProgect;

import java.util.Random;

public class RandomPanGenerator{
    public static String generateRandomPan() {
        Random random = new Random();
        StringBuilder panBuilder = new StringBuilder();

        char[] uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();


        for (int i = 0; i < 5; i++) {
            char randomLetter = uppercaseLetters[random.nextInt(26)];
            panBuilder.append(randomLetter);
        }

        for (int i = 0; i < 4; i++) {
            int randomNumber = random.nextInt(10);
            panBuilder.append(randomNumber);
        }

        char lastLetter = uppercaseLetters[random.nextInt(26)];
        panBuilder.append(lastLetter);

        return panBuilder.toString();
    }
}

