package JavaPrograms;

public class Fibonacci_Series {
    public static void main(String[] args) {
        int num = 12;
        int a;
        int b = 0, c = 1;

        while(num > 0) {
            a = b;
            b = c;
            c = a + b;
            System.out.print(a + " ");
            num--;
        }
    }
}
