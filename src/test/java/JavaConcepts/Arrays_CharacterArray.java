package JavaConcepts;

public class Arrays_CharacterArray {

    public static void main(String[] args) {
        char[] chArr = {'a', 'j', 'i', 't'};

        System.out.println(chArr.length);

        System.out.println("\n************** Iterate through char array **************");

        for(int i = 0; i <= chArr.length - 1; i++){
            System.out.println("chArr["+i+"]: " + chArr[i]);
        }

        System.out.println("\n************** String to char array **************");

        String str = "ajit";
        char[] strToChArr = str.toCharArray();

        for (int i = 0; i <= strToChArr.length - 1; i++){
            System.out.println("strToChArr["+i+"] : " + strToChArr[i]);
        }

        System.out.println("\n************** char array to String **************");

        char[] charArr = {'b', 'h', 'q'};
        String newStr = new String(charArr);

        System.out.println("Char array to String conversion is: " + newStr);
    }
}
