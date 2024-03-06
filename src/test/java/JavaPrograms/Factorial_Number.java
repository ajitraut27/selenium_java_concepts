package JavaPrograms;

public class Factorial_Number {
    public static void main(String[] args) {
        int num = 5;
        int factNum = 1;
        System.out.print("Factorial of number " + num);

        while (num > 0){
            factNum = factNum * num;
            num--;
        }

        System.out.println(" is: " + factNum);
    }
}
