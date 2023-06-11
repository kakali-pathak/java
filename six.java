/*to check if a number is prime or not,by taking the number as input from the keyboard */
import java.util.Scanner;
public class six {
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();

    boolean isPrime = true;

    if (number < 2) {
        isPrime = false;
    }
    else{
        for (int i = 2; i <= Math.sqrt(number); i++){
            if (number % i == 0){
                isPrime = false;
                break;
            }
        }
    }
    if (isPrime){
        System.out.println(number + " is a prime number.");
    }
    else{
        System.out.println(number + " is not a prime number.");
    }
    scanner.close();
}
    
}
