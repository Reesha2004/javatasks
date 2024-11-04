package basic.javatask.com;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);

        System.out.print("Enter an number: ");
        int num = in.nextInt();
        int onum=num;
        int sum = 0;
        while (num > 0) {
        	sum=sum*10+(num%10);
            num=num/10;        
        }
        
        if(onum==sum) {
        	System.out.println("The number is palindrome");	
        }
        else {
        	System.out.println("The number is not palindrome");
        }
        in.close();

	}

}
