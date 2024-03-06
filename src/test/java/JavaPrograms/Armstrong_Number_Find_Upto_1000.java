package JavaPrograms;

public class Armstrong_Number_Find_Upto_1000 {
    public static void main(String[] args) {
        int num;
        int remainder;
        int sum = 0;

        for (int i = 0; i < 1000; i++) {
            num = i;
            while (num > 0){
                remainder = num % 10;
                sum = sum + (remainder * remainder * remainder);
                num = num / 10;
            }

            if(sum == i){
                System.out.println(i + " :Number is an armstrong");
            }

            sum = 0;
        }
    }
}
