package JavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Compare_ArrayList_Elements {
    public static void main(String[] args) {
        List<Integer> intList1 = new ArrayList<>(Arrays.asList(3, 5, 2, 6, 7, 9, 1, 4, 8));
        List<Integer> intList2 = new ArrayList<>(Arrays.asList(3, 5, 6, 2, 7, 1, 4, 9, 8));

        System.out.println("List 1: " + intList1);
        System.out.println("List 2: " + intList2);

        Collections.sort(intList1);
        Collections.sort(intList2);

        System.out.println("List 1 After sort: " + intList1);
        System.out.println("List 2 After sort: " + intList2);

        if(intList1.equals(intList2)){
            System.out.println("Lists are equal");
        }else {
            System.out.println("Lists are not equal");
        }
    }
}
