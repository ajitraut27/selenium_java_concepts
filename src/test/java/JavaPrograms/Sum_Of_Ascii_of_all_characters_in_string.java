package JavaPrograms;

public class Sum_Of_Ascii_of_all_characters_in_string {
    public static void main(String[] args) {
        String str = "Ajit Ramdas Raut";
        int sum = 0;

        for (int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i) + " : Ascii value is = " + (int) str.charAt(i));
            sum = sum + str.charAt(i);
        }
        System.out.println("Sum of ASCII value of all characters: " + sum);
    }
}
