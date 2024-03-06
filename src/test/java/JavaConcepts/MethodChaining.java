package JavaConcepts;

public class MethodChaining {

    private int a;
    private float b;

    MethodChaining() { System.out.println("Calling The Constructor"); }

    public MethodChaining setInt(int a)
    {
        this.a = a;
        return this;
    }

    public MethodChaining setFloat(float b)
    {
        this.b = b;
        return this;
    }

    void display()
    {
        System.out.println("Display=" + a + " " + b);
    }

    public static void main(String[] args)
    {
        // This is the "method chaining".
        new MethodChaining().setInt(10).setFloat(20).display();
    }
}