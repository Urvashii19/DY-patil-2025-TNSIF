package mapdemo;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Set;

public class HashMapTableDemo {

    public static void main(String[] args) {

        Hashtable<Integer, String> ht = new Hashtable<>();

        ht.put(101, "Mumbai");
        ht.put(102, "New Mumbai");
        ht.put(103, "Pune");
        ht.put(101, "Aurangbad"); // Overwrites "Mumbai"
        ht.put(104, "New Mumbai");

        System.out.println("Initial Hashtable: " + ht);

        ht.putIfAbsent(105, "PCMC"); // Adds new entry
        ht.put(101, "Baramati"); // Replaces "Aurangbad"

        System.out.println("After putIfAbsent and update: " + ht);

        // ht.put(null, "shcvhj"); // Invalid in Hashtable

        System.out.println("Value at key 103: " + ht.get(103));

        System.out.println("Replaced value at 102: " + ht.replace(102, "Bombay"));

        System.out.println("After replace: " + ht);

        // Proper usage of clone
        @SuppressWarnings("unchecked")
        Hashtable<Integer, String> clonedHT = (Hashtable<Integer, String>) ht.clone();
        System.out.println("Cloned Hashtable: " + clonedHT);

        Set<Integer> s = ht.keySet();
        System.out.println("Keys: " + s);

        Collection<String> c = ht.values();
        System.out.println("Values: " + c);
    }
}
