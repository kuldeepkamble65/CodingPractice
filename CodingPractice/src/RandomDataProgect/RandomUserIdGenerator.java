package RandomDataProgect;

import java.util.Random;

public class RandomUserIdGenerator {

    public static long generateRandomUserId(){
        Random random = new Random();
        int randomUserId = random.nextInt(20000);
        return (long) randomUserId;
    }

}
