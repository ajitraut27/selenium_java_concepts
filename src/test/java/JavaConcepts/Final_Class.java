package JavaConcepts;

public final class Final_Class {
    public static void main(String[] args) {
        Final_Class obj = new Final_Class();
        System.out.println("This class is declared as final, so it cannot be extented");
    }
}

// Below subclass will give compile time error and will not be extended using Final class

/*class SubClass extends Final_Class{

}*/
