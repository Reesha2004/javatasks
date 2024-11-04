package basic.javatask.com;
import java.util.*;

public class SumOfDigits {
	public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = in.nextInt();
        int sum = 0;
        int temp = number;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;        
        }
        System.out.println("Sum of digits: " + sum);
        in.close();
    }
}
