package JavaPrograms;

public class Sort_Integer_In_Array {
    public static void main(String[] args) {
        Integer[] arr = {1, 3, 5, 6, 4, 8, 2, 9};
        int temp;

        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - i - 1; j++){
                if (arr[j] < arr[j+1]){     // or if (arr[j].compareTo(arr[j+1]) > 0){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (Integer i : arr){
            System.out.print(i + " ");
        }

        System.out.println("Smaller int: " + arr[arr.length - 1]);
    }
}
