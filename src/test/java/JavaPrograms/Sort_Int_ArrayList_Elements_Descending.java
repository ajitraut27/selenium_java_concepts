package JavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort_Int_ArrayList_Elements_Descending {

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>(Arrays.asList(3, 5, 2, 6, 7, 9, 1, 4, 8));

        System.out.println("Before sort: " + intList);

        Collections.sort(intList, Collections.reverseOrder());
        System.out.println("After sort: " + intList);
    }
}
