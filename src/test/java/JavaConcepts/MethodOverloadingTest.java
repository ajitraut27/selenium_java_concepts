package JavaConcepts;

public class MethodOverloadingTest {

    public int add(int x , int y){
        return x + y;
    }

    public double add(double x , double y){
        return x + y;
    }

    public static void main(String[] args) {
        MethodOverloadingTest tc = new MethodOverloadingTest();

        int ans1 = tc.add(2, 3);
        double ans2 = tc.add(2.4, 3.6);

        System.out.println(ans1);
        System.out.println(ans2);
    }
}
