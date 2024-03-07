package RandomDataProgect;

import java.util.Random;

public class RandomEventNamesGenerator {
    public static String genrateEventName(){
        Events[] eventTypes = Events.values();
        Random random = new Random();

        int randomIndex = random.nextInt(12)+1;

        String eventName = eventTypes[randomIndex].toString();

        return eventName;
    }
}
