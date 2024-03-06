package JavaPrograms;

import java.util.Arrays;

public class Remove_Duplicate_From_Array {
    public static void main(String[] args)
    {
        int arr[] = { 11, 12, 13, 14, 14, 14, 15, 15 ,12};

        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        // Return, if array is empty or contains a single element
        if (arr.length == 0 || arr.length == 1)
            System.out.println(arr.length);

        int[] temp = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            // If current element is not equal to next element then store that current element
            if (arr[i] != arr[i + 1]) {
                temp[j] = arr[i];
                j++;
            }
        }
        // Store the last element as whether it is unique or repeated, it hasn't stored previously
        temp[j++] = arr[arr.length - 1];

        System.out.println("New array: ");
        for (int i = 0; i < j; i++){
            arr[i] = temp[i];
            System.out.print(arr[i] + " ");
        }
    }
}
