package JavaPrograms;

public class Reverse_String_Using_Recursion {
    public static void main(String[] args) {
        String str = "ajit";
        String reversedStr = recursionFunction(str);
        System.out.println("Reversed string: " + reversedStr);
    }

    public static String recursionFunction(String str){
        if (str.isEmpty()){
            return str;
        }

        return recursionFunction(str.substring(1)) + str.charAt(0);
    }
}
