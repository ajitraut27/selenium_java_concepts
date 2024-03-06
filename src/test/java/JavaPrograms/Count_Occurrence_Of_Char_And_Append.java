package JavaPrograms;

public class Count_Occurrence_Of_Char_And_Append {
    public static void main(String[] args) {
        String str = "aabbbccccaaaaa";
        StringBuilder newStr = new StringBuilder();
        int count = 1;

        for(int i = 0; i < str.length() - 1; i++){
            if (str.charAt(i) == str.charAt(i+1)){
                count = count + 1;
            }else {
                newStr.append(str.charAt(i)).append(count);
                count = 1;
            }
        }
        newStr.append(str.charAt(str.length() - 1)).append(count);
        System.out.println("Result: " + newStr);
    }
}
