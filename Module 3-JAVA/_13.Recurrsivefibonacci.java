import java.util.Scanner;

public class Recursivefibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) {return n;}
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the position (n) of Fibonacci number: ");
        int n = scanner.nextInt();
        System.out.println("Fibonacci number at position " + n + " is " + fibonacci(n));
    }
}
