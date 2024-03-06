package JavaPrograms;

import java.util.Arrays;

public class array_shift_0_to_end {
    public static void main(String[] args) {
        int[] arr = {2,4,6,0,0,6,2,0,9};

        System.out.println("Original Array: " + Arrays.toString(arr));

        int nonZeroIndex = 0;

        for (int i =0; i< arr.length; i++){
            if(arr[i]!=0){
                arr[nonZeroIndex] = arr[i];
                nonZeroIndex++;
            }
        }

        while (nonZeroIndex < arr.length){
            arr[nonZeroIndex] = 0;
            nonZeroIndex++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
