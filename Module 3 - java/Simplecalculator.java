// 2. Simple Calculator
// Objective: Practice arithmetic operations and user input.

import java.util.Scanner;

public class Simplecalculator{
    public static void main(String[] commandLineArgs) {
        Scanner userInputScanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double firstOperand = userInputScanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double secondOperand = userInputScanner.nextDouble();
        
        System.out.println("Choose an operation (+, -, *, /): ");
        char arithmeticOperator = userInputScanner.next().charAt(0);
        
        double calculationResult = 0;
        boolean isOperationValid = true;
        
        switch (arithmeticOperator) {
            case '+':
                calculationResult = firstOperand + secondOperand;
                break;
            case '-':
                calculationResult = firstOperand - secondOperand;
                break;
            case '*':
                calculationResult = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    calculationResult = firstOperand / secondOperand;
                } else {
                    System.out.println("Cannot divide by zero!");
                    isOperationValid = false;
                }
                break;
            default:
                System.out.println("Invalid operator!");
                isOperationValid = false;
        }
        
        if (isOperationValid) {
            System.out.println("Result: " + calculationResult);
        }
        
        userInputScanner.close();
    }
}
