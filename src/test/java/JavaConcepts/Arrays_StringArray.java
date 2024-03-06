package JavaConcepts;

public class Arrays_StringArray {

    public static void main(String[] args) {
        String[] strArr = new String[]{"s1", "s2", "s3", "s4"};

        System.out.println("strArr length: " + strArr.length);

        System.out.println("\n********** Print String array ************");

        for (String s : strArr){
            System.out.println(s);
        }

        System.out.println("\n********** String array after update ************");
        strArr[2] = "s5";

        for (String s : strArr){
            System.out.println(s);
        }

        System.out.println("\n********** Iterate through an Array ************");

        for(int i = 0; i <= strArr.length - 1; i++){
            System.out.println("strArr["+i+"] : " + strArr[i]);
        }

        System.out.println("\n********** 2D String Array ************");

        String[][] str2DArr = new String[][]{
                {"a1", "a2", "a3"},
                {"b1", "b2", "b3"}
        };

        for (int i = 0; i <= str2DArr.length - 1; i++){
            for (int j = 0; j < str2DArr[i].length; j++){
                System.out.println("str2DArr["+i+"]["+j+"] : " + str2DArr[i][j]);
            }
        }

        System.out.println("\n********** Jagged String Array ************");

        String[][] strJaggArr = new String[][]{
                {"c1", "c2", "c3"},
                {"d1", "d2"}
        };

        for (int i = 0; i <= strJaggArr.length - 1; i++){
            for (int j = 0; j < strJaggArr[i].length; j++){
                System.out.println("strJaggArr["+i+"]["+j+"] : " + strJaggArr[i][j]);
            }
        }
    }
}
