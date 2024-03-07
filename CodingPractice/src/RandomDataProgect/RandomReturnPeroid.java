package RandomDataProgect;

import java.util.Random;

public class RandomReturnPeroid {

    public static String genrateRandomReturnPeroid(){
        Random random = new Random();
        int month =random.nextInt(12)+1;
        int year = random.nextInt(8)+2017;

        return month +"-"+ year;

    }
}
