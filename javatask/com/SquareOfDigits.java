package basic.javatask.com;

import java.util.Scanner;

public class SquareOfDigits {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);

        System.out.print("Enter an number: ");
        int num = in.nextInt();
        int sum = 0;
        while (num != 0) {
        	int digit=num%10;
        	sum+=(int) Math.pow(digit, 2);
            num=num/10;        
        }
        System.out.print("The sum of square of digit: "+sum); 
        
in.close();
	}

}
