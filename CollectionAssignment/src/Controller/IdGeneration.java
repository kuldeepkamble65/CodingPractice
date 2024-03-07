package Controller;

import java.util.HashMap;
import java.util.Map;

public class IdGeneration {
    private static final Map<String,Long> idMap = new HashMap<>();

    public static long generateProductId(String CartItem){
        long id = 1000L;
        if(idMap.containsKey(CartItem)){
         id = idMap.get(CartItem) +1000L;

        }
        idMap.put(CartItem, id);
        return id;
    }


}
