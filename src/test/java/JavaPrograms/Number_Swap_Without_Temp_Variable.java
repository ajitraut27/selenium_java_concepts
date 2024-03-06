package JavaPrograms;

public class Number_Swap_Without_Temp_Variable {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        System.out.println("\nBefore Swap: ");
        System.out.println("num1: " + num1 + " num2: " + num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("\nAfter Swap: ");
        System.out.println("num1: " + num1 + " num2: " + num2);
    }
}
