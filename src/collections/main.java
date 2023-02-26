package collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class main {
    //HashMap
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(5, "Hello");
        map.put(10, "Java");
        System.out.println(map.get(10));

        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key + " " + value);
        }
    }




}
