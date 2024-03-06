package JavaConcepts;

import java.util.Arrays;

public class Arrays_IntegerArray {
    // Array is a data structure used to store collection of same data type.
    // Size of array is fixed once it is created and cannot be changed.
    // Each element in array is accessed by index and starting with 0


    public static void main(String[] args) {
        int[] intArr = new int[5];
        System.out.println("Size of integer array: " + intArr.length);

        intArr[0] = 10;
        intArr[1] = 11;
        intArr[2] = 12;
        intArr[3] = 13;
        intArr[4] = 14;

        for(int a: intArr){
            System.out.println(a);
        }

        System.out.println("\n********** Iterate through an Array **********");

        for(int i = 0; i < intArr.length; i++){
            System.out.println(intArr[i]);
        }

        System.out.println("\n********** Cloned Array **********");

        int[] clonedArr = intArr.clone();
        for(int i = 0; i < clonedArr.length; i++) {
            System.out.println(clonedArr[i]);
        }

        System.out.println("\n********** Array to String **********");

        String newStr = Arrays.toString(intArr);
        System.out.println(newStr);
        System.out.println(newStr.charAt(10));

        System.out.println("\n********** 2D Array **********");

        int[][] int2DArr = {
                { 22, 33, 44, 55 } ,
                { 66, 77, 88, 99 }
        };

        System.out.println(int2DArr.length);

        for(int i = 0; i <= int2DArr.length - 1; i++){
            for (int j = 0; j < int2DArr[i].length; j++){
                System.out.println("int2DArr["+i+"]["+j+"] : " + int2DArr[i][j]);
            }
        }

        System.out.println("\n********** Jagged Array **********");

        int[][] jaggArr = {
                {22, 32, 42},
                {52, 62}
        };

        for(int i = 0; i <= jaggArr.length - 1; i++){
            for (int j = 0; j < jaggArr[i].length; j++){
                System.out.println("jaggArr["+i+"]["+j+"] : " + jaggArr[i][j]);
            }
        }
    }
}
