/*Write a program to show that during function overloading, if no matchng argument is found
 then java will apply automatic type conversions(from lower to higher data type)
 */
public class eleven {
    public void display(int num) {
        System.out.println("Displaying int: " + num);
    }
    public void display(double num) {
        System.out.println("Displaying double: " + num);
    }
    public static void main(String[] args) {
        eleven demo = new eleven();
        demo.display(10);
        demo.display(3.14f);
        demo.display((byte) 5);
        demo.display('A');
    }
}
