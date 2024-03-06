package JavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Convert_List_To_Array {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>(Arrays.asList(2,5,6,8,12,9,3,6,7));

        System.out.println(intList);

        Integer[] intArr = new Integer[intList.size()];

        intList.toArray(intArr);

        for(int i = 0; i < intArr.length; i++){
            System.out.print(intArr[i] + " ");
        }
    }
}
