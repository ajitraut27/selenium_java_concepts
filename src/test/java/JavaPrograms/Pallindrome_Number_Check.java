package JavaPrograms;

public class Pallindrome_Number_Check {
    public static void main(String[] args) {
        int orginalNum = 121;
        int remainder;
        int reverseNum = 0;
        int num = orginalNum;

        System.out.println("Original Number: " + orginalNum);

        while (orginalNum > 0){
            remainder = orginalNum % 10;
            reverseNum = reverseNum * 10 + remainder;
            orginalNum = orginalNum / 10;
        }

        System.out.println("Reversed Number: " + reverseNum);

        if (reverseNum == num){
            System.out.println("Number is pallindrome");
        }else {
            System.out.println("Number is not pallindrome");
        }
    }
}
