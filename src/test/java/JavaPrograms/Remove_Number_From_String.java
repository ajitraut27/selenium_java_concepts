package JavaPrograms;

public class Remove_Number_From_String {
    public static void main(String[] args) {
        String str = "aji2t ra4ut";

        String newStr = str.replaceAll("\\d","");
//        String newStr = str.replaceAll("[0-9]","");
        System.out.println("Original String: " + str);
        System.out.println("New String: " + newStr);
    }
}
