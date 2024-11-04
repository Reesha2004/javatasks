package basic.javatask.com;

import java.util.Scanner;

public class FibonacciNthNum {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the position of the Fibonacci number: ");
	        int n = scanner.nextInt();

	        int fibonacciNumber = fibonacci(n);
	        System.out.println("The " + n + "-th Fibonacci number is: " + fibonacciNumber);

	        scanner.close();
	    }

	    public static int fibonacci(int n) {
	        if (n <= 1) {
	            return n;
	        }

	        int a = 0, b = 1, fib = 1;
	        for (int i = 2; i <= n; i++) {
	            fib = a + b; 
	            a = b; 
	            b = fib; 
	        }
	        return fib;
	    }
	}
