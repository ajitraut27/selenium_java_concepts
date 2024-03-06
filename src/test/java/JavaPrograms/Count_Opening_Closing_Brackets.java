package JavaPrograms;

public class Count_Opening_Closing_Brackets {
    public static void main(String[] args) {
        String input = "(((((())))";
        int openingBracket = 0;
        int closingBracket = 0;
        int pairedBracket = 0;

        for (int i = 0; i < input.length(); i++){
            if(input.charAt(i) == '('){
                openingBracket++;
            }else if (input.charAt(i) == ')'){
                closingBracket++;

                if (i > 0 && input.charAt(i-1) == '('){
                    pairedBracket++;
                }
            }
        }

        System.out.println("Opening brackets: " + openingBracket);
        System.out.println("Closing brackets: " + closingBracket);
        System.out.println("Pairing brackets: " + pairedBracket);
    }
}
