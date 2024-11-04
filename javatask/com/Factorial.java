package basic.javatask.com;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = in.nextInt();
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + n + " is: " + factorial);
        in.close(); 

	}

}