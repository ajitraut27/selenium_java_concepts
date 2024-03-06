package JavaPrograms;

public class Array_To_2D_Array {
    public static void main(String[] args) {
        int row = 0, col = 0;

        int[] arr = {11, 12, 13, 14, 22, 33, 44, 55, 10, 20, 30, 40, 23, 34, 45, 56, 67, 78};

        System.out.println(arr.length);
        row = arr.length / 2;

        int count = 0;

        for (int i = 0; i < row; i++){
            if(i % 2 == 0){
                col = 2;
            }else {
                col = 3;
            }

            int[][] dArr = new int[row][col];

            for (int j = 0; j < col; j++){
                if (count == arr.length){
                    break;
                }

                dArr[i][j] = arr[count];
                System.out.println("dArr["+i+"]["+j+"]: " + dArr[i][j]);

                count++;
            }
        }
    }
}
