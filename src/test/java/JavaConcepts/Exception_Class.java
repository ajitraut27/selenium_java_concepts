package JavaConcepts;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;

public class Exception_Class {

    int x = 10;
    int y = 0;

    public static void main(String[] args) {
        Exception_Class obj = new Exception_Class();

        try {
            System.out.println(obj.x / obj.y);
        } catch (ArithmeticException e1) {
            System.out.println(e1.getMessage());
        }

        System.out.println("\n");

        try{
            int[] num = {10, 22, 12, 33};
            for (int i = 0; i <= num.length; i++){
                System.out.println(num[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e2){
            System.out.println(e2.getMessage());
        }

        System.out.println("\n");

        try {
            File objFile = new File("/Users/Ajit/Downloads/p12.txt1");
            FileReader fr = new FileReader(objFile);
        } catch (FileNotFoundException e3) {
            System.out.println(e3.getMessage());
        }

        System.out.println("\n");

        try{
            int num1 = Integer.parseInt("174.11");
            System.out.println(num1);
        }catch (NumberFormatException e4){
            System.out.println(e4.getMessage());
            System.out.println("Number format exception");
        }

        System.out.println("\n");

        try{
            Class.forName("JavaConcepts.Exception_1_ArithmeticException1");
            System.out.println("No exception found");
        }catch (ClassNotFoundException e5){
            System.out.println(e5.getMessage());
            System.out.println("Class not found");
        }

        System.out.println("\n");

        try{
            String s = null;
            System.out.println(s.charAt(0));
        }catch (NullPointerException e6){
            System.out.println(e6.getMessage());
            System.out.println("Null Pointer exception");
        }

        System.out.println("\n");

        try {
            ArrayList<String> al = new ArrayList<>();
            al.add("aa");
            al.add("aad");

            Iterator<String> itr = al.iterator();
            //
            // itr.next();
            itr.remove();
            System.out.println(al);
        } catch (IllegalStateException e7) {
            System.out.println(e7.getMessage());
            System.out.println("Illegal State Exception");
        }
    }
}
