package FailFast_FailSafe_HashMap_HashTable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FailFast_HashMap_ConcurrentModification_Exception {
    public static void main(String[] args) {
        Map<Integer, String> hm = new HashMap<>();
        hm.put(1, "a1");
        hm.put(2, "a2");
        hm.put(3, "a3");
        System.out.println(hm);

        Iterator itr = hm.keySet().iterator();

        while (itr.hasNext()){
            System.out.println(hm.get(itr.next()));

            //When we use the Fail-fast iterator, it immediately throws ConcurrentModificationException when an
            // element is added or removed from the collection while the thread is iterating over the collection.
            // Below line will generate exception
            hm.put(4, "a4");
        }
    }
}
