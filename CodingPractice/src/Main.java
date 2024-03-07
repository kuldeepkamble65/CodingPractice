import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Map<String, Object> inputMap = new HashMap<>();
        inputMap.put("first_name", "kuldeep");
        inputMap.put("Last_name", "kamble");

        Map<String, Object> outputMap = replaceKeyWithHyphen(inputMap);
        System.out.println("origanl inputmap " +inputMap);
        System.out.println("modified outputmap " +outputMap);


    }

        public static Map<String, Object> replaceKeyWithHyphen(Map<String, Object> inputMap){
            Map<String, Object> outputMap = new HashMap<>();


            for(Map.Entry<String, Object> entry : inputMap.entrySet()){

                String modifiedKey = entry.getKey().replace("_","-");
                outputMap.put(modifiedKey, entry.getValue());
            }
            return outputMap;
    }
}