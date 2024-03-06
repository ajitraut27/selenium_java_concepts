package JavaConcepts;

public class Static_Methods {
    void print(){
        System.out.println("Access print method without static keyword in it and using creating object");
    }

    static void print(int num){
        System.out.println("Access print method with static keyword in it : "+ num);
        // When method is declared with static keyword then it can be accessed using class name
        // and without creating an object of that class
    }

    public static void main(String[] args) {
        Static_Methods obj = new Static_Methods();
        obj.print();

        print(10);
        Static_Methods.print(20);
    }
}
