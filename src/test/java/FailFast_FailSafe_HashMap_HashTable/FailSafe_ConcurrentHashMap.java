package FailFast_FailSafe_HashMap_HashTable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafe_ConcurrentHashMap {
    public static void main(String[] args) {
        Map<Integer, String> hm = new HashMap<>();
        hm.put(1, "a1");
        hm.put(2, "a2");
        hm.put(3, "a3");
        System.out.println("Original HashMap: " + hm);

        System.out.println("\nConcurrent HashMap values: ");

        ConcurrentHashMap<Integer, String> chm = new ConcurrentHashMap<>(hm);

        Iterator itr = chm.keySet().iterator();

        while (itr.hasNext()){
            System.out.println(chm.get(itr.next()));

            //The Fail-safe iterator creates a copy of the original collection or object array and iterates over that copied collection.
            // Any structural modification made in the iterator affects the copied collection, not the original collection.
            // Therefore, the original collection remains structurally unchanged.
            //The Fail-safe iterator doesn't throw an exception when a collection is modified while iterating over it.
            chm.put(4, "a4");
        }

        System.out.println("\nOriginal HashMap after iteration doesn't impacted: " + hm);
    }
}
