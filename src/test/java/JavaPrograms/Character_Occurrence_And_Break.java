package JavaPrograms;

public class Character_Occurrence_And_Break {
    public static void main(String[] args) {
        String str = "madam";
        String str1;
        boolean flag = false;

        for (int i = 0; i < str.length()-1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    str1 = str.substring(i + 1);
                    System.out.println("New string: " + str1);
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
    }
}
