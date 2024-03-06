package JavaPrograms;

import java.util.HashSet;

public class Number_Remove_Duplicates_From_Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5, 5};

        HashSet<Integer> hs = new HashSet<>();

        for(int i = 0; i < arr.length; i++){
            hs.add(arr[i]);
        }

        System.out.println(hs);
    }
}
