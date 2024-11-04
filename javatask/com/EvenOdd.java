package basic.javatask.com;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=in.nextInt();
		if(num%2==0) {
	    System.out.print("The number is even ");	
		}
		else {
	    System.out.print("The number is odd ");	
		}
in.close();
	}

}
