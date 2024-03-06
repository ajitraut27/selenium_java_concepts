package JavaConcepts;

public class Keyword_This {
    int num;

    Keyword_This(int num){
        this.num = num;
        // this keyword refers to instance of class i.e. num and
        // also used to distinguish between num variable of class and method parameter
    }

    void print(){
        System.out.println("Value of num without this keyword: " + num); // this keyword is optional here
        System.out.println("Value of num with this keyword: " + this.num);
    }

    public static void main(String[] args){
        Keyword_This obj = new Keyword_This(10);
        obj.print();
    }
}
