// 8. Operator Precedence
// Objective: Explore how Java evaluates expressions.
public class OperatorPrecc {
    public static void main(String[] args) {
        int result = 17 + 5 * 3;
        System.out.println("Result of 17 + 5 * 3 = " + result); // 5 * 3 = 15, then 17 + 15 = 32

        int result2 = (10 + 5) * 2;
        System.out.println("Result of (10 + 5) * 2 = " + result2); // (10 + 5) = 15, then 15 * 2 = 30
    }
}
