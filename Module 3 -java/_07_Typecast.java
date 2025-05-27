// 7. Type Casting Example
// Objective: Practice type casting between different data types.

public class TypeCast {
    public static void main(String[] args) {
        double decimalValue = 10.25;
        int intValue = (int) decimalValue; // explicit casting
        
        int wholeNumber = 57;
        double convertedValue = wholeNumber; // implicit casting
        
        System.out.println("Double to int: " + intValue);
        System.out.println("Int to double: " + convertedValue);
    }
}
