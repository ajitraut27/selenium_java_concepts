package JavaConcepts;

public class Final_Variable {

    final int num = 10;

    public static void main(String[] args) {
        Final_Variable obj = new Final_Variable();

        System.out.println("Final value of num: " + obj.num);

        //obj.num = 20;   // This statement will give compile time error as value of final variable cannot be changed
        //System.out.println("Try to change value of Final num: " + obj.num);
    }
}
