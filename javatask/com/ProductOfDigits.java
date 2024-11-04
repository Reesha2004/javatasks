package basic.javatask.com;

import java.util.Scanner;

public class ProductOfDigits {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = in.nextInt();
        int pro = 1;
        int temp = number;

        while (temp > 0) {
            pro *= temp % 10;
            temp /= 10;        
        }
        System.out.println("Product of digits: " + pro);
        in.close();

	}

}
