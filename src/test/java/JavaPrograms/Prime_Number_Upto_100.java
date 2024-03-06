package JavaPrograms;

public class Prime_Number_Upto_100 {
    public static void main(String[] args) {
        int num;
        boolean flag = false;

        for (int i = 0; i < 100; i++) {
            num = i;
            if (num == 0 || num == 1) {
                System.out.println("Number is not prime: " + num);
            } else {
                for (int j = 2; j <= num / 2; j++) {
                    if (num % j == 0) {
                        flag = true;
                        break;
                    }
                }

                if (!flag) {
                    System.out.println("Number is prime: " + num);
                }
            }
            flag = false;
        }
    }
}
