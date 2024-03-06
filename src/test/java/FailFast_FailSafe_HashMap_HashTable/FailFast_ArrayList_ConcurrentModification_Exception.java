package FailFast_FailSafe_HashMap_HashTable;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFast_ArrayList_ConcurrentModification_Exception {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Mac");
        al.add("Windows");
        al.add("Linux");
        al.add("Unix");

        System.out.println(al);

        Iterator itr = al.iterator();

        while (itr.hasNext()){
            if(itr.next() == "Windows"){
                al.remove("Unix");
            }
        }
    }
}
