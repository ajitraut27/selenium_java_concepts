package JavaConcepts;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class hashSet_test {
    public static void main(String[] args) {
        HashSet<String> s1 = new HashSet<String>();
        s1.add("a1");
        s1.add("a2");
        s1.add("a3");
        s1.add("a4");
        s1.add("a5");
        s1.add("a4");
        s1.add(null);

        System.out.println(s1.size());

        Iterator<String> ll = s1.iterator();
        while(ll.hasNext()){
            System.out.println(ll.next());
        }
    }
}
