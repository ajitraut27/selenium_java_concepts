package JavaPrograms;

public class Reverse_Number {
    public static void main(String[] args) {
        int orginalNum = 1212;
        int remainder;
        int revNumber = 0;

        System.out.println("Original Number: " + orginalNum);

        while (orginalNum > 0){
            remainder = orginalNum % 10;
            revNumber = revNumber * 10 + remainder;
            orginalNum = orginalNum / 10;
        }

        System.out.println("Reversed Number: " + revNumber);
    }
}
