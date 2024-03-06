package JavaPrograms;

public class Reverse_String {
    public static void main(String[] args) {
        String str = "ajit";
        String reversedStr = "";

        System.out.println("Original String: " + str);

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr = reversedStr + str.charAt(i);
        }

        System.out.println("Reversed String: " + reversedStr);
    }
}
