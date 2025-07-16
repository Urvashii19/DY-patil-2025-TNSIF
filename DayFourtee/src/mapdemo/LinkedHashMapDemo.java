package mapdemo;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

    public static void main(String[] args) {

        LinkedHashMap<Integer, Object> ht = new LinkedHashMap<>();

        ht.put(101, 1000);       // Integer
        ht.put(1012, 23.34);     // Double
        ht.put(203, "Pune");     // String
        ht.put(401, 10);         // Integer
        ht.put(101, 3000);       // Overwrites 1000
        ht.put(102, 3000);       // Integer

        System.out.println(ht);
    }
}
