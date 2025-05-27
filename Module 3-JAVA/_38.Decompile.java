public class Decompile {
    public String greet(String name) {
        return "Hello, " + name + "!";
    }

    public static void main(String[] args) {
        Decompile s = new Decompile();
        System.out.println(s.greet("World"));
    }
}
//compile the code : javac Decompile.java
//To use tools like JD-GUI or CFR to open 
//java -jar cfr.jar Decompile.class

