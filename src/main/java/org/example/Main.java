package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("*********Welcome to Scientific Calculator Menu*********");
            System.out.println("1. Square Root Function");
            System.out.println("2. Factorial Function");
            System.out.println("3. Natural Logarithm");
            System.out.println("4. Power Function");
            System.out.println("5. Exit");
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    calSquareRoot(scanner);
                    break;
                case 2:
                    calFactorial(scanner);
                    break;
                case 3:
                    calNaturalLogarithm(scanner);
                    break;
                case 4:
                    calPowerFunction(scanner);
                    break;
                case 5:
                    System.out.println("Exiting from the application");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again...");
            }
        } while (choice != 5);
        scanner.close();
    }

    public static void calSquareRoot(Scanner scanner)
    {
        System.out.println("Enter a number for which you want to calculate the square root");
        double a = scanner.nextDouble();
        double result = Math.sqrt(a);
        System.out.println("The square root of a number is: " + result);
    }

    public static void calFactorial(Scanner scanner)
    {
        System.out.println("Enter a number for which you want to calculate the factorial");
        int n = scanner.nextInt();
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans *= i;
        }
        System.out.println("The factorial of a number is: " + ans);
    }

    public static void calNaturalLogarithm(Scanner scanner)
    {
        System.out.println("Enter a number for which you want to calculate the logarithm");
        double n = scanner.nextDouble();
        double result = Math.log(n);
        System.out.println("The natural logarithm of a number is: " + result);
    }

    public static void calPowerFunction(Scanner scanner)
    {
        System.out.println("Enter the base");
        double b = scanner.nextDouble();
        System.out.println("Enter the exponent");
        double e = scanner.nextDouble();
        double result = Math.pow(b, e);
        System.out.println("The power of a number: " + b + " raised to the power of " + e + " is: " + result);
    }
}
