package JavaPrograms;

public class Armstrong_Number_Check {
    public static void main(String[] args) {
        int num = 153;
        int remainder;
        int sum = 0;
        int temp = num;

        while (num > 0){
            remainder = num % 10;
            sum = sum + (remainder * remainder * remainder);
            num = num / 10;
        }

        if(temp == sum){
            System.out.println(temp + " :Number is an armstrong\n");
        }else {
            System.out.println(temp + " :Number is not an armstrong\n");
        }
    }
}
