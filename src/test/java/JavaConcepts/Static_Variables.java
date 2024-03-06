package JavaConcepts;

public class Static_Variables {
    int num2 = 20;

    static int num = 10;
    // When variable declared with static keyword then it becomes class/static variable.
    // And can be shared among all instances of class

    public static void main(String[] args){
        Static_Variables obj = new Static_Variables();
        System.out.println("num variable without Static keyword and via object: " + obj.num2);

        System.out.println("num variable with Static keyword: " + num);
        // static variable can be accessed without creating object of that class

        System.out.println("num variable with Static keyword and using classname: " + Static_Variables.num);
        // static variable can be accessed using classname.variable_name
    }
}
