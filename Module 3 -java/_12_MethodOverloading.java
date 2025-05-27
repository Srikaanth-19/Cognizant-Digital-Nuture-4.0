public class MethodOverloading {
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
        System.out.println("Sum of 6 and 12: " + add(6, 12));
        System.out.println("Sum of 3.5 and 3.8: " + add(3.5, 3.8));
        System.out.println("Sum of 1, 2 and 3: " + add(1, 2, 3));
    }
}
