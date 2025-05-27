public class PatternMatch {
    public static void typeChecker(Object obj) {
        switch (obj) {
            case Integer i -> System.out.println("Integer: " + i);
            case String s -> System.out.println("String: " + s);
            case Double d -> System.out.println("Double: " + d);
            default -> System.out.println("Unknown type");
        }
    }

    public static void main(String[] args) {
        typeChecker(89);
        typeChecker("Java Basics");
        typeChecker(9.87);
    }
}
