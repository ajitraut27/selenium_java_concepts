package JavaPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Count_Occurrence_Of_Number_In_Array {

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 6, 2, 8, 9, 1, 3, 5, 6, 7, 8, 2, 1, 5, 3};

        List<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            arrList.add(arr[i]);
        }

        System.out.println(arrList);

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arrList.size(); i++) {
            hm.put(arrList.get(i), Collections.frequency(arrList, arrList.get(i)));
        }

        System.out.println(hm);
    }
}
