package JavaConcepts;

public class Static_NestedClass {

    static class InnerClass{
        static int num = 10;

        static void print(){
            System.out.println("Inner Class print method");
        }
    }

    public static void main(String[] args) {
        System.out.println("num of static inner class: " + InnerClass.num);
        InnerClass.print();
    }
}
