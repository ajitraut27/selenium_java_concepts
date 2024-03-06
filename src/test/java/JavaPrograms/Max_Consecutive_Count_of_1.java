package JavaPrograms;

public class Max_Consecutive_Count_of_1 {
    public static void main(String[] args) {
        int[] arr1 = {0,0,1,1,1,0,0,1,0,1,1,1,1,1,1,1,0,0,0,1,1,1};
        int count = 0;
        int maxCount = 0;

        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] == 1){
                count++;
//                maxCount = Math.max(maxCount, count);
// OR
                maxCount = (maxCount >= count) ? maxCount : count;
            }else {
                count = 0;
            }
        }

        System.out.println("Max consecutive count of 1 is: " + maxCount);
    }
}
