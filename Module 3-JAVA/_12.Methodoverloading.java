public class Methodoverloading {
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 15 and 10: " + add(15, 10));
        System.out.println("Sum of 2.75 and 3.5: " + add(2.75, 3.5));
        System.out.println("Sum of 1, 2 and 3: " + add(1, 2, 3));
    }
}
