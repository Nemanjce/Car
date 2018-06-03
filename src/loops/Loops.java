package loops;

/**
 *
 * @author qa-popodne
 */
public class Loops {

    public static void testWhileLoop() {
        int x = 4;

        while (x > 0) {
            System.out.println("Value of x: " + x);
            x--;
        }
        System.out.println("Value of x after while loop : " + x);
    }

    public static void testDoWhileLoop() {

        int y = 6;
        do {
            System.out.println("Value of y is: " + y);
            y--;

        } while (y > 4);
    }

    public static void testForLoop() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Value of i: " + i);

        }
    }

    public static void testDoubleForLoop() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("i=" + i + ", j=" + j);

            }

        }}
            public static void testMultiplicationTable() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int z = i * j;
                System.out.println(i+ " * " + j + " = " + z);

            }

        }
    }
    

}
