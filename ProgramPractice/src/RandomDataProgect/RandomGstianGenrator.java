package RandomDataProgect;

import java.util.Random;

public class RandomGstianGenrator {

    public static String generateRandomGstian(String panNo) {


        Random random = new Random();
        StringBuilder gstinBuilder = new StringBuilder();
//        String sc = "0";
        StringBuilder sc = new StringBuilder("0");
        int statecode = random.nextInt(37) + 1;
        if (statecode < 10) {
            gstinBuilder.append(sc.append(statecode));
        } else {
            gstinBuilder.append(statecode);
        }
//        --------------------------------------------------------------------

        gstinBuilder.append(panNo);
//       -----------------------------------------------------------------------
        int randomDigit = random.nextInt(10);
        gstinBuilder.append(randomDigit);

        gstinBuilder.append('Z');

        int randomDigit2 = random.nextInt(10);
        gstinBuilder.append(randomDigit2);

        return gstinBuilder.toString();
    }
}
