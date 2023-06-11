/*Write a program to show the difference between public and private access specifiers. The 
 program should also show that primitive data types are passed by value and objects are 
 passed by value and objects are passed by reference and to learn use of final keyword
 */
public class twelve {
    private int privateVariable = 10;
    public int publicVariable = 20;

    private void privateMethod() {
        System.out.println("This is a private mthod.");

    }

    public void publicMethod() {
        System.out.println("This is a public method.");
    }
    public void modifyVariables(int primitiveValue, MyClass object)  {
    primitiveValue += 5;
    object.value += 5;
    }
    public void modifyFinalVariable(final int finalValue) {
        System.out.println("Final value: " + finalValue);
    }
    public static void main(String[] args) {
        twelve demo = new twelve();
        System.out.println("Public variable: " + demo.publicVariable);
        demo.publicMethod();
        int primitiveValue = 10;
        System.out.println("Before modification - Primitive value: " + primitiveValue);
        demo.modifyVariables(primitiveValue, null);
        System.out.println("After modification - Primitive value: " + primitiveValue);
        twelve.MyClass object = demo.new MyClass(20);
        System.out.println("Before modification - Object value: " + object.value);
        demo.modifyVariables(0, object);
        System.out.println("After modification - Object value: " + object.value);
        final int finalValue = 5;
        demo.modifyFinalVariable(finalValue);
    }

    class MyClass {
        public int value;

        public MyClass(int value) {
            this.value = value;
        }
    }
}
