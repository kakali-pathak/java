/*Crate a multifile program where in one file a string message is taken as input from the
 user and th function to display the message on the screen is in another file(make use of 
 Scanner package in this program)
 */
import java.util.Scanner;

public class fifteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a message: ");
        String message = scanner.nextLine();
        scanner.close();

        DisplayMessageForFifteen.display(message);
    }
}
