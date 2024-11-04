package basic.javatask.com;

import java.util.Scanner;

public class DivisorsofNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        System.out.println("Divisors of " + number + " are: ");
        findDivisors(number);

        scan.close();
    }

 
    public static void findDivisors(int number) {
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                System.out.print(i + " ");

                if (i != number / i) {
                    System.out.print((number / i) + " ");
                }
            }
        }
    }
}
