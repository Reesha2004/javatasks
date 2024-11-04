package basic.javatask.com;
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);

        System.out.print("Enter an number: ");
        int num = in.nextInt();
        int sum = 0;
        while (num > 0) {
        	sum=sum*10+(num%10);
            num=num/10;        
        }
        System.out.println("Sum of reverse: " + sum);
        in.close();

	}

}
