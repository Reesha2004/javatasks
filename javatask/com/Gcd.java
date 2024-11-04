package basic.javatask.com;

import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter first number: ");
		int num1=in.nextInt();
		System.out.print("Enter first number: ");
		int num2=in.nextInt();
		int res=gcd(num1,num2);
		System.out.println("The GCD of "+num1+" and "+num2+" is "+res);
		in.close();
	}
	
	public static int gcd(int num1,int num2) {
		while(num2!=0)
		{
			int temp=num2;
			num2=num1%num2;
			num1=temp;
		}return num1;
		}
		

}
