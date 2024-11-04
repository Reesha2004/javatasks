package basic.javatask.com;

import java.util.Scanner;

public class SumOfNnaturalNum {
	
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);

	        System.out.print("Enter the value of N: ");
	        int n = scan.nextInt();

	        int a = sum(n);
	        System.out.println("Sum of first " + n + " natural numbers : " + a);

	        scan.close();
	    }

	    public static int sum(int n) {
	        return n * (n + 1) / 2;
	    }	 
	}
