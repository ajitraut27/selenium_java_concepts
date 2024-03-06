package JavaConcepts;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class LinkedList_NoSpecificType {
    public static void main(String[] args) {
        LinkedList intLL = new LinkedList(Arrays.asList(11, 12, 13, 14));
        System.out.println(intLL);

        intLL.add("s1");        // add method to add element to list
        intLL.add('a');
        System.out.println(intLL);

        System.out.println("\n************* Iterate using iterator ***************");

        Iterator itr = intLL.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("\n************* Iterate using for loop ***************");

        for (int i = 0; i < intLL.size(); i++){
            System.out.println(intLL.get(i));   // get method to access element from list
        }

        System.out.println("\n************* Iterate using Enhanced for loop ***************");

        for(Object elem : intLL){
            System.out.println(elem);
        }

        System.out.println("\n************* Remove element ***************");

        intLL.remove(1);
        intLL.remove("s1");
        intLL.remove(Integer.valueOf("14"));
        intLL.remove(Character.valueOf('a'));

        System.out.println(intLL);

        intLL.removeFirst();
        System.out.println(intLL);

        System.out.println("\n************* Add element at first index ***************");

        intLL.addFirst(12.23);
        System.out.println(intLL);

        intLL.addLast("23St");
        System.out.println(intLL);

//        intLL.offer("13");      // add element at last
//        System.out.println(intLL);
//
//        intLL.poll();              // removes head or first element
//        System.out.println(intLL);

        System.out.println("\n************* Convert list into array ***************");

        List<Integer> intLL1 = new LinkedList<>(Arrays.asList(1,3,4,56));
        System.out.println(intLL1);

        Object[] a1 = intLL1.toArray();
        System.out.println(a1[3]);

    }
}
