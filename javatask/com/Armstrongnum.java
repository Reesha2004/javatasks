package basic.javatask.com;
import java.util.Scanner;

public class Armstrongnum {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);

        System.out.print("Enter an number: ");
        int num = in.nextInt();
        int onum= num;
        int sum = 0;
        int len=String.valueOf(num).length();
        while (num != 0) {
        	int digit=num%10;
        	sum+=(int) Math.pow(digit, len);
            num=num/10;        
        }
        if(sum==onum) {
        System.out.println("It's a Armstrong number");
        }
        else {
        System.out.println("Not an Amstrong number");}
        in.close();

	}

}
