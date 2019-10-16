package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {

            System.out.print("Enter number: ");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();

                if (number < min) {
                    min = number;
                }

                if (number > max) {
                    max = number;
                }

                System.out.println("The minimum number = " + min + " / The maximum number = " + max);
                scanner.nextLine();
            } else {
                System.out.println("Invalid Value");
                scanner.nextLine();
            }
        }
//        scanner.close();
    }
}
