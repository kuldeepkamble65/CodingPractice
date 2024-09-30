package RandomDataProgect;

import java.util.Random;

public class RandomUploadType {

    public static String generateRandomUploadType(){
        Random random = new Random();
        String[] uploadType = {"json","excel"};
        int randomIndex = random.nextInt(2);
        return uploadType[randomIndex];
    }
}
