package RandomDataProgect;

import java.util.*;

import static RandomDataProgect.Events.GSTR3B_UPLOAD;
import static RandomDataProgect.RandomEventNamesGenerator.genrateEventName;
import static RandomDataProgect.RandomGstianGenrator.generateRandomGstian;
import static RandomDataProgect.RandomPanGenerator.generateRandomPan;
import static RandomDataProgect.RandomReturnPeroid.genrateRandomReturnPeroid;
import static RandomDataProgect.RandomTransactionIdGeneration.genrateRandomTrasactionId;
import static RandomDataProgect.RandomUploadType.generateRandomUploadType;
import static RandomDataProgect.RandomUserIdGenerator.generateRandomUserId;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------------------------------");

        String randomPan = generateRandomPan();
        System.out.println("Random PAN: " + randomPan);
        System.out.println("-------------------------------------------------------------------------------");

        String randomGstin = generateRandomGstian(randomPan);
        System.out.println("Random GSTIN: " + randomGstin);
        System.out.println(" --------------------------------------------------------------------------------");

        long userId = generateRandomUserId();
        System.out.println("Random UserId: " + userId);
        System.out.println("-------------------------------------------------------------------------------");

        String returnPeriod = genrateRandomReturnPeroid();
        System.out.println("Random ReturnPeroid: "+returnPeriod);
        System.out.println("-------------------------------------------------------------------------------");

        String uploadType = generateRandomUploadType();
        System.out.println("Random UplaodType: "+uploadType);
        System.out.println("-------------------------------------------------------------------------------");

        String transactionId = genrateRandomTrasactionId();
        System.out.println("Random TransactionId: "+transactionId);
        System.out.println("-------------------------------------------------------------------------------");

        String randomEvent = genrateEventName();
        System.out.println("Random Event Name: " + randomEvent);
        System.out.println("-------------------------------------------------------------------------------");

//        List<Map<String, Object>> randomDataList = new ArrayList<>();
//
//        for (int i = 0; i < 3; i++) {
//            String randomPanNo = generateRandomPan();
//
//            Map<String, Object> randomData = new HashMap<>();
//            randomData.put("PanNo", randomPanNo);
//            randomData.put("Gstian_NO", generateRandomGstian(randomPanNo));
//            randomData.put("user_Id", generateRandomUserId());
//            randomData.put("Trasaction_Id", genrateRandomTrasactionId());
//            randomData.put("Upload_Type", generateRandomUploadType());
//            randomData.put("Return_peroid", genrateRandomReturnPeroid());
//
//            randomDataList.add(randomData);
//        }
//        System.out.println(randomDataList);

        List<Events> eventList = new ArrayList<>();

        for(Events events : Events.values()){
            eventList.add(events);
            System.out.println("List of the events "+events);
        }
        List<Map<Events, Map<String, Object>>> eventDataList = new ArrayList<>();
        Random random = new Random();
        System.out.println("------------------------------------------------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of pan");
        int NOofpan = sc.nextInt();

        for (int i = 0; i < NOofpan; i++) {
            String pan = generateRandomPan();
            String gstin = generateRandomGstian(pan);
            long user_Id = generateRandomUserId();
            String randomMonth = genrateRandomReturnPeroid();
            String[] str = randomMonth.split("-");
            int month = Integer.parseInt(str[0]);
            System.out.println(month);

            for(int j=0; j<month;j++){
                String trasactionId = genrateRandomTrasactionId();

                int noOfEvents = random.nextInt(eventList.size());
            for(int k=0; k< noOfEvents; k++){
                int indexofEventList = random.nextInt(eventList.size());

                Events events = eventList.get(indexofEventList);

                Map<String, Object> randomDataOfEvents = new HashMap<>();

                    randomDataOfEvents.put("Pan No :", pan);
                    randomDataOfEvents.put("User Id :", user_Id);
                    randomDataOfEvents.put("GSTIN no :", gstin);
                    randomDataOfEvents.put("Transaction Id :", trasactionId);
                    randomDataOfEvents.put("returnPeriod :", month);
                    randomDataOfEvents.put("Event Name :",events);

                if (events == Events.GSTR3B_UPLOAD) {
                    randomDataOfEvents.put("UploadType :", uploadType);
                }

                Map<Events, Map<String, Object>> eventDataMap = new HashMap<>();

                eventDataMap.put(events, randomDataOfEvents);

                eventDataList.add(eventDataMap);

                System.out.println("Event: " + events);
                System.out.println("Details: " +randomDataOfEvents);
               }
            }
        }
    }

}
