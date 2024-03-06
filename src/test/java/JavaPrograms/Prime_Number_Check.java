package JavaPrograms;

public class Prime_Number_Check {
    public static void main(String[] args) {
        int num = 13;
        boolean flag = false;

        if(num == 0 || num == 1){
            System.out.println("Number is not prime: " + num);
        }else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0){
                    flag = true;
                    break;
                }
            }

            if (!flag){
                System.out.println("Number is prime: " + num);
            }else {
                System.out.println("Number is not prime: " + num);
            }
        }
    }
}
