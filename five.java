/*To convert a dcimal to binary number  */
public class five {
    public static void main(String[] args){
        int decimalNumber = 10;
        String binaryNumber = Integer.toBinaryString(decimalNumber);
        System.out.println("Binary equivalent of " + decimalNumber + " is " + binaryNumber);
        int binNum = Integer.parseInt("1010", 2);
        System.out.println("Decimal equivalent of 1010 is " + binNum);
    }
}
