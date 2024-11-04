package basic.javatask.com;

import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int a = countDigits(number);
        System.out.println("Number of digits: " + a);

        scanner.close();
    }

    public static int countDigits(int number) {
        int count = 0;

        number = Math.abs(number);

        // Special case for 0
        if (number == 0) {
            return 1;
        }

        while (number > 0) {
            number /= 10;
            count++;
        }

        return count;
    }
}
