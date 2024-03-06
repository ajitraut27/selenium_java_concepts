package FailFast_FailSafe_HashMap_HashTable;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMap_Vs_HashTable {
    public static void main(String[] args) {
        Map<String, String> hmap = new HashMap<>();
        hmap.put("1", "a1");
        hmap.put("2", "a2");
        hmap.put("3", "a3");
        hmap.put("4", "a4");
        System.out.println("HashMap: " + hmap);

        Map<String, String> htable = new Hashtable<>();
        htable.put("1", "b1");
        htable.put("2", "b2");
        htable.put("3", "b3");
        htable.put("4", "b4");
        System.out.println("HashTable: " + htable);
    }
}
