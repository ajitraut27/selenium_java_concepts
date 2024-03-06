package JavaConcepts;

public class Static_Block {

    static int num;

    static{
        num = 10;
        System.out.println("num accessed via Static block: " + num);
        // Static block will be called before main method or when the class is loaded
    }

    static{
        num = 20;
        System.out.println("Static block 2 and num: " + num);
    }

    public static void main(String[] args) {
        System.out.println("This is main method will be called after static block");
        // This line will print after static block executes

        System.out.println(num);
    }
}
