import java.lang.reflect.*;


public class Person {
    public void sayHello() {
        System.out.println("Hello from Person!");
    }

    public void greet(String name) {
        System.out.println("Hello, " + name);
    }
}


public class ReflectTest {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("Person");

        Object obj = cls.getDeclaredConstructor().newInstance();

        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Method: " + method.getName());

            Class<?>[] paramTypes = method.getParameterTypes();
            for (Class<?> param : paramTypes) {
                System.out.println(" - Parameter type: " + param.getName());
            }
        }

        Method sayHello = cls.getDeclaredMethod("sayHello");
        sayHello.invoke(obj);

        Method greet = cls.getDeclaredMethod("greet", String.class);
        greet.invoke(obj, "Alice");
    }
}
