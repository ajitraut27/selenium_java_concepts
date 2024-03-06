package JavaConcepts;

public class Keyword_Super extends ParentClass {
    int num = 20;

    Keyword_Super(int num) {
        super(num); // super can be used to call constructor of parent class
    }

    void print(){
        System.out.println("Value of child num: " + this.num);
        System.out.println("Value of parent num: " + super.num);
        super.print();
        // super refers to parent class to access variables and methods of super class when overridden
    }

    public static void main(String[] args){
        Keyword_Super obj = new Keyword_Super(10);
        obj.print();
    }
}

class ParentClass{
    int num;
    void print(){
        System.out.println("Value of parent num using super on method: " + num);
    }

    ParentClass(int num){
        this.num = num;
    }
}
