package JavaPrograms;

public class Number_Smaller_In_Array {
    public static void main(String[] args) {
        int[] arr = {10, 5, 40, 12, 1, 56, 3, 18, 5, 12};
        int temp;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (Integer i : arr){
            System.out.print(i + " ");
        }

        System.out.println("\nSmaller integer number is: " + arr[arr.length - 1]);
    }
}
