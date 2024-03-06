package JavaPrograms;

public class Number_Swap_With_Temp_Variable {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int temp;

        System.out.println("Before Swap: ");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("\nAfter Swap: ");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }
}
