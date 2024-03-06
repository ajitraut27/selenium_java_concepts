package JavaConcepts;

import java.util.*;

public class ArrayList_IntegerType {
    public static void main(String[] args) {
        List<Integer> intArrList = new ArrayList<>(Arrays.asList(41, 42, 42, 43, null, null));

        System.out.println("Integer array list: " + intArrList);

        ArrayList<Integer> intArrList2 = new ArrayList<>(Arrays.asList(51, 52, 52, null, null));
        System.out.println("Integer array list 2: " + intArrList2);

        intArrList.remove(Integer.valueOf(41));
        intArrList.remove(null);
        System.out.println("After remove: " + intArrList);

        intArrList.add(0,61);
        intArrList.add(3,62);
        System.out.println(intArrList);

        Iterator<Integer> ll = intArrList.iterator();
        while (ll.hasNext()){
            System.out.println(ll.next());
        }

        List<Integer> intArrList11 = new ArrayList<>(Arrays.asList(41, 42, 42, 43));
        List<Integer> intArrList12 = new ArrayList<>(Arrays.asList(41, 42, 31, 42, 43));

        Collections.sort(intArrList12);
        System.out.println(intArrList12);
        System.out.println(intArrList11.equals(intArrList12));
    }
}
