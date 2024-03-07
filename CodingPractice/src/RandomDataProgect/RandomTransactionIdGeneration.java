package RandomDataProgect;

import java.util.Random;
import java.util.UUID;

public class RandomTransactionIdGeneration {
    public static String genrateRandomTrasactionId(){
        return  UUID.randomUUID().toString();
    }
}
