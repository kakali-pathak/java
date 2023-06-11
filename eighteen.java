/*Write a program -DivideByZero that takes two numbers a and b as input, computes a/b, 
 and invokes Arithmetic Exception to generate a message when the denominator is zero.
 */
import java.util.Scanner;

public class eighteen {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the numerator (a): ");
    int a = scanner.nextInt();

    System.out.print("Enter the denominator (b): ");
    int b = scanner.nextInt();
    try{
        int result = divide(a, b);
        System.out.println("Result: " + result);
    }
    catch(ArithmeticException e) {
        System.out.println("Error: " + e.getMessage());
    }
   }    
   public static int divide(int a, int b) {
    if (b == 0) {
        throw new ArithmeticException("Cannot divide by zero!");
    }
    return a / b;
   }
}
