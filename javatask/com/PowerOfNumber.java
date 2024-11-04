package basic.javatask.com;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);

        System.out.print("Enter number1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number2: ");
        int num2 = in.nextInt();
        int a=(int)Math.pow(num1, num2);
        System.out.print("Power of Numbers: "+a); 
in.close();
	}

}
