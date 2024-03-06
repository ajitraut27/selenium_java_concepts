package JavaConcepts;

public class Final_Method extends Super_Final_Method{

    /*void print(){
        // This method will give compile time error
        System.out.println("print method is final in parent class, so it cannot be overriden");
    }*/

    public static void main(String[] args) {
        Final_Method obj = new Final_Method();
        obj.print();
    }
}

class Super_Final_Method{
    final void print(){
        System.out.println("This is final print method of Super class");
    }
}
