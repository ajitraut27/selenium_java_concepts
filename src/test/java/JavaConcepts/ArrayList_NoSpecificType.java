package JavaConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayList_NoSpecificType {

    public static void main(String[] args) {

        // Arraylist with no specific type and can have integer/string/character

        System.out.println("\n************* Arraylist without specific type ****************");
        ArrayList al = new ArrayList();
        al.add(11);
        al.add("aa");
        al.add('c');

        System.out.println(al);

        for (int i = 0; i < al.size(); i++){
            System.out.println(al.get(i));
        }

        System.out.println("\n************* List without specific type ****************");

        List ll = new ArrayList();
        ll.add(10);
        ll.add("abc");
        ll.add('s');

        System.out.println(ll);

        System.out.println("\n************* Iterate through list ****************");

        Iterator itr = ll.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("\n************* Remove element from array list if no specific type ****************");

        ll.remove(Integer.valueOf(10));     // this will remove element one by one
        ll.remove("abc");
        ll.remove(Character.valueOf('s'));

        System.out.println(ll);

        if(ll.isEmpty()){
            System.out.println("List is empty");
        }

        ll.add(11);
        ll.add(12);
        System.out.println("ll: " + ll);

        System.out.println("\n************* Clear  all elements from array list ****************");

        ll.clear();     // Clear method to empty collection
        System.out.println("Is ll is empty: " + ll.isEmpty());

        System.out.println("\n************* Remove and Retain elements from array list ****************");

        List ll2 = new ArrayList();
        ll2.add(11);
        ll2.add(13);
        ll2.add(14);

        System.out.println("ll2: " + ll2);

        List ll3 = new ArrayList(Arrays.asList(11, 13, 15, 16));
        System.out.println("ll3: " + ll3);

        ll2.removeAll(ll3);
        System.out.println("ll2 after remove all ll3: " + ll2);
        System.out.println("ll3 after remove all from ll2: " + ll3);

        ll2.retainAll(ll3);
        System.out.println("ll2 after retain all ll3: " + ll2);

        System.out.println("\n************* Contains elements from array list ****************");

        List ll4 = new ArrayList(Arrays.asList(21, 22, 23));
        System.out.println("ll4: " + ll4);
        System.out.println("is ll4 contains 21: " + ll4.contains(21));
        System.out.println("is ll4 contains 25: " + ll4.contains(25));

        System.out.println("\n************* Contains All elements from array list ****************");

        List ll5 = new ArrayList(Arrays.asList(31, 32, 21, 23, 21, 22, 23));
        System.out.println("ll5: " + ll5);
        System.out.println("Is ll5 contains all ll4 elements: " + ll5.containsAll(ll4));
        System.out.println("Is ll4 contains all ll5 elements: " + ll4.containsAll(ll5));

    }
}
