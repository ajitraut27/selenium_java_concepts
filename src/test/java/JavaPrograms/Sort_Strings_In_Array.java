package JavaPrograms;

public class Sort_Strings_In_Array {
    public static void main(String[] args) {
        String[] arr = {"raut", "ajit", "ramdas", "scorpio", "base"};
        String temp = "";

        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - i - 1; j++){
                if(arr[j].compareTo(arr[j+1]) > 0){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (String s1 : arr){
            System.out.print(s1 + " ");
        }
    }
}
