package JavaConcepts;

import static JavaConcepts.Static_Variables.*;
import static JavaConcepts.Static_Methods.*;

public class Static_Import {

    public static void main(String[] args) {
        System.out.println("Import static num variable: " + num);
        // This variable is declared as static in class "Static_Variables"
        // and then imported using import static keyword

        System.out.println("Import static methods: ");
        print(25);
        // static method called using import
    }
}
