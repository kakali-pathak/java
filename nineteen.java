/*Write a program to show the use of nested try statements that emphasizes the sequence of
 checking for catch handler statements.
 */
public class nineteen {
    public static void main(String[] args){
        try {
            int[] numbers = {1, 2, 3};

            try {
                int result = numbers[4];
                System.out.println("Result: " + result);
            }
            catch(
                ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch block: ArrayIndexOutOfBoundsException");
                throw new ArithmeticException("ArithmeticException from inner catch block");
                }
                finally{
                    System.out.println("Inner finally block");
                }
        }
        catch(ArithmeticException e) {
            System.out.println("Outer finally block");
        }
    }
}
