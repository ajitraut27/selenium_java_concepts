package JavaPrograms;

public class Pallindrome_String_Check {
    public static void main(String[] args) {
        String str = "Mallayallam";
        String reversedStr = "";

        System.out.println("Original String: " + str);

        for (int i = str.length() - 1; i >= 0 ; i--) {
            reversedStr = reversedStr + str.charAt(i);
        }

        System.out.println("Reversed String: " + reversedStr);

        if(str.equalsIgnoreCase(reversedStr)){
            System.out.println("Pallindrome String");
        }else {
            System.out.println("Not a Pallindrome String");
        }
    }
}
