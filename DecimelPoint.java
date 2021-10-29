/*
Question 1
Write a java program to make the amount in decimal point format by specific the point of decimal
     -Input amount=12345, point=0 => Output value=12345
     -Input amount=12345, point=2 => Output value=123.45
     -Input amount=12345, point=5 => Output value=0.12345
     -Input amount=12345, point=7 => Output value=0.0012345

The point value never < 0
 */
import java.util.Scanner;

public class DecimelPoint {
    public static void main(String args[]) {
        int decimalCount;
        double input;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number and no of decimal points : ");
        input = sc.nextDouble();
        decimalCount = sc.nextInt();
        System.out.println("Converted value : "+ DecimelPoint.moveDecimal(input,decimalCount));
    }

    public static double moveDecimal(double input,int decimalCount) {
        if(decimalCount <0) {
            System.out.println("No of decimal points can not be less than 0, enter again :");
            decimalCount = new Scanner(System.in).nextInt();
        }
        return (input / Math.pow(10,decimalCount));
    }
}
