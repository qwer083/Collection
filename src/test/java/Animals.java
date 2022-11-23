import java.util.HashMap;

public class Animals {
    public static void main(String[] args) {

        HashMap<String, Integer> catsHashMap = new HashMap<>();
        catsHashMap.put("Muffin", 1);
        catsHashMap.put("Sunny", 3);
        catsHashMap.put("Xerox", 6);
        catsHashMap.put("Flash", 2);

        HashMap<String, Integer> dogsHashMap = new HashMap<>();
        dogsHashMap.put("Jack", 2);
        dogsHashMap.put("John", 1);
        dogsHashMap.put("Joe", 5);

        HashMap<String, Integer> allHashMap = new HashMap<>();
        allHashMap.putAll(catsHashMap);
        allHashMap.putAll(dogsHashMap);
        System.out.println(allHashMap);

    }
}