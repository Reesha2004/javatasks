package basic.javatask.com;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        
        boolean isPowerOfTwoLoop = isPowerOfTwoLoop(number);
        System.out.println(number + " is a power of 2: " + isPowerOfTwoLoop);

        scan.close();
    }

    public static boolean isPowerOfTwoLoop(int number) {
        if (number <= 0) return false;
        
        while (number > 1) {
            if (number % 2 != 0) return false; 
            number /= 2;
        }
        
        return true;
    }
}

