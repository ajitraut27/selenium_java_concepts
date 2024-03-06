package JavaPrograms;

public class String_Swap_With_Temp_Variable {
    public static void main(String[] args) {
        String str1 = "Ajit";
        String str2 = "Raut";
        String temp = "";

        System.out.println("Before Swap: ");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        temp = str1;
        str1 = str2;
        str2 = temp;

        System.out.println("\nAfter Swap: ");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
    }
}
