package JavaConcepts;

interface a1 {
    void disp1();
}

interface a2 {
    void disp2();
}

public class InterfaceTest implements a1, a2 {
    public void disp1(){
        System.out.println("aa1");
    }

    public void disp2(){
        System.out.println("aa");
    }


    public static void main(String[] args) {
        InterfaceTest t3 = new InterfaceTest();
        t3.disp1();
        t3.disp2();
    }
}
