import java.util.HashMap;
import java.util.Map;

public class RemoveZeroProduct {
    public static void main(String[] args) {

        Map<String, Integer> stockMap = new HashMap<>();

        stockMap.put("book", 10);
        stockMap.put("pen", 30);
        stockMap.put("mobile", 0);
        stockMap.put("mouse",5);

        Map<String, Integer> updatedMap = removeZeroQuantityProduct(stockMap);
        System.out.println("orignal proudct: "+stockMap);
        System.out.println("updatedMap: "+updatedMap);

    }
    public static Map<String, Integer> removeZeroQuantityProduct(Map<String,Integer> stockmap){
        Map<String, Integer> updatedMap = new HashMap<>();

        for(Map.Entry<String,Integer> entry: stockmap.entrySet()){
            String key = entry.getKey();
            int value = entry.getValue();

            if(key.equals("mobile")) {
                key = "cell_phone";
            }
            if(value>20){

                updatedMap.put(key, value);
            }
        }
        return updatedMap;
    }
    /**
     * replace mobile with cell_phone and remove values less than 20
     */

}
