/*To find the factorial of a given number */
public class two {
    public static void main(String[] args){
        int num = 5;
        int factorial = findFactorial(num);
        System.out.println(num + "!="+factorial);
    }
    public static int findFactorial(int n){
        if (n==0){
            return 1;
        }
        else{
            return n* findFactorial(n-1);
        }
    }
}
