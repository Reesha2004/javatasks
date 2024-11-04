package basic.javatask.com;

import java.util.Scanner;

public class SumDigUntilSingle {

	

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = scan.nextInt();

	        int result = Single(number);
	        System.out.println("Single digit sum: " + result);

	        scan.close();
	    }

	  
	    public static int Single(int number) {
	        while (number >= 10) {
	            number = sumOfDigits(number);
	        }
	        return number;
	    }

	 
	    public static int sumOfDigits(int number) {
	        int sum = 0;
	        while (number > 0) {
	            sum += number % 10;
	            number /= 10;
	        }
	        return sum;
	    }
	}

