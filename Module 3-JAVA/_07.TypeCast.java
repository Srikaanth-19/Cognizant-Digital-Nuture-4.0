public class TypeCast {
    public static void main(String[] args) {
        double decimalValue = 9.99;
        int intValue = (int) decimalValue; // explicit casting
        
        int wholeNumber = 15;
        double convertedValue = wholeNumber; // implicit casting
        
        System.out.println("Double to int: " + intValue);
        System.out.println("Int to double: " + convertedValue);
    }
}
