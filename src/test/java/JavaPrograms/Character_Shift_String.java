package JavaPrograms;

public class Character_Shift_String {
    public static void main(String[] args) {
        String str = "Hyderabad";
        System.out.println("Original String: " + str);

        for (int i = 0; i < str.length() - 1; i++){
            str = str + str.charAt(0);
            str = str.substring(1);
            System.out.println(str);
        }

        System.out.println("\n****************************\n");
        String str1 = "Hyderabad";
        System.out.println("Original String: " + str1);

        for (int i = str1.length() - 1; i >= 0; i--){
            str1 = str1.charAt(str1.length()-1) + str1;
            str1 = str1.substring(0, str1.length() - 1);
            System.out.println(str1);
        }
    }
}
