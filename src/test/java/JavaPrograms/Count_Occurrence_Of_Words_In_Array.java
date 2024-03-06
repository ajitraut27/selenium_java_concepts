package JavaPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Count_Occurrence_Of_Words_In_Array {
    public static void main(String[] args) {
        String[] arr = {"ajit", "raut", "ajit", "test", "raut", "ajit raut"};

        List<String> arrList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arrList.add(arr[i]);
        }

        System.out.println(arrList);

        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < arrList.size(); i++) {
            hm.put(arrList.get(i), Collections.frequency(arrList, arrList.get(i)));
        }

        System.out.println(hm);
    }
}
