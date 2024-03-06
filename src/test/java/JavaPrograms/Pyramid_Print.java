package JavaPrograms;

public class Pyramid_Print {

    public static void pyramidProg(){

        int num = 5;

        for (int i = 0; i < num; i++) {
            for (int j = 1; j < num - i ; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pyramidProg2(){

        int num = 5;

        for (int i = num - 1; i >= 0; i--) {
            for (int j = 1; j < num - i ; j++) {
                System.out.print(" ");
            }

            for (int k = i; k >= 0; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pyramidProg();
//        System.out.println("\n");
        pyramidProg2();
    }
}
