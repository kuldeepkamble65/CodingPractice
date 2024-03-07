package Map.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "kuldeep");
        map.put(2, "vaibhav");
        map.put(3, "omkar");

        //duplicate key
        map.put(2,"abc");

        //duplicate value
        map.put(3, "kuldeep");

        // null key
        map.put(null, "amar");
        map.put(null, "pqr");  // only single null key can add

        // remove element
        map.remove(2);

        // element present or not
        System.out.println(map.containsKey(5));


        // get element
        System.out.println(map.get(1));

        // replace element
        System.out.println(map.replace(3, "aaa"));
        System.out.println(map);





//        Set set = map.entrySet();   // using enteryset()
//        System.out.println(set);
//
//        Iterator iterator = set.iterator();  // using iterator
//        while (iterator.hasNext()){
//            //System.out.println(iterator.next());
//            Map.Entry entery = (Map.Entry) iterator.next();       // using Entery
//            System.out.println(entery.getKey()+ " "+entery.getValue());
//        }
//
//        System.out.println("using foreach loop");
//        for(Map.Entry mE : map.entrySet()){
//            System.out.println(mE.getKey()+ " "+mE.getValue());
//        }


    }
}
