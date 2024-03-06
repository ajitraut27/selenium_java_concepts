package JavaConcepts;

public class Generics_Test<T> {
    T obj;

    Generics_Test(T obj){   // Constructor
        this.obj = obj;
    }

    public T getObj(){
        return this.obj;
    }

    static <T> void print(T element){
        System.out.println(element.getClass().getName() + ": " + element);
    }

    public static void main(String[] args) {
        Generics_Test<Integer> iObj = new Generics_Test<>(20);
        System.out.println(iObj.getObj());

        Generics_Test<String> sObj = new Generics_Test<>("ajit");
        System.out.println(sObj.getObj());

        Generics_Test<Double> dObj = new Generics_Test<>(223242.0);
        System.out.println(dObj.getObj());

        Generics_Test<Character> cObj = new Generics_Test<>('c');
        System.out.println(cObj.getObj());

        print(11);

        print("str");

        print('c');
    }
}
