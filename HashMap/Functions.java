package HashMap;
import java.io.*;
import java.util.*;
public class Functions {
    public static void main(String[] args) {
        HashMap<Integer,String>map = new HashMap<>();

        // functionality of the put function
        map.put(1,"Hemlata");
        map.put(2,"Himanshi");
        map.put(3,"Dolly");
        map.put(4,"Hemu");

        System.out.println("HashMap of the given data is : "+ map);

        // functionality of the get function
        String result = map.get(3);
        System.out.println("Value for the given key is: "+ result);

        // functionality of the containsKey function
        System.out.println(map.containsKey(2));

        // functionality of the remove function
        map.remove(4);
        System.out.println("Updated hashmap : " + map);

        // iterating using the for loop
        for(Map.Entry <Integer,String>e : map.entrySet()){
            System.out.println("HashMap is -> " + e.getKey()+ " : " + e.getValue());
        }

    }
}
