/*To find the sum of any number of integers entered as command 
line argument */

import java.util.Scanner;
public class one {
    public static void main ( String[]args ){
        int totalNumbers = Integer.parseInt(args[0]);
        int totalSum=0;
        Scanner scanner = new Scanner(System.in);
        for (int i=1; i<=totalNumbers; i++){
        System.out.print ("Enter integer#"+i+":");
        int number = scanner.nextInt();
        totalSum += number;
    }
    System.out.println("The sum of the integer is :" +totalSum);
    scanner.close();
    }
    
}
