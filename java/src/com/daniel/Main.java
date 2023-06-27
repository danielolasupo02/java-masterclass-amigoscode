package com.daniel;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        16. Write a Java program to print a face.
//        Expected Output
//
//        +"""""+
//[| o o |]
// |  ^  |
// | '-' |
// +-----+
//        System.out.println(" +\"\"\"\"\"+");
//        System.out.println("[| o o |]");
//        System.out.println(" |  ^  |");
//        System.out.println(" | '-' | ");
//        System.out.println(" +-----+");

//        17. Write a Java program to add two binary numbers.
//                Input Data:
//        Input first binary number: 10
//        Input second binary number: 11
//        Expected Output
//
//        Sum of two binary numbers: 101

//
//                Scanner scanner = new Scanner(System.in);
//
//                System.out.print("Enter the first binary number: ");
//                long binary1 = scanner.nextLong();
//
//                System.out.print("Enter the second binary number: ");
//                long binary2 = scanner.nextLong();
//
//                long sum = addBinary(binary1, binary2);
//
//                System.out.println("Sum of the binary numbers: " + sum);


//        31. Write a Java program to check whether Java is installed on your computer.
//                try {
//                    // Execute the command "java -version" in the command prompt
//                    Process process = Runtime.getRuntime().exec("java -version");
//
//                    // Wait for the process to finish
//                    int exitCode = process.waitFor();
//
//                    // Check the exit code to determine if Java is installed
//                    if (exitCode == 0) {
//                        System.out.println("Java is installed.");
//                    } else {
//                        System.out.println("Java is not installed.");
//                    }
//                } catch (Exception e) {
//                    // Handle any exceptions that may occur
//                    System.out.println("Java is not installed or an error occurred.");
//                    e.printStackTrace();
//                }
//            }

//        32. Write a Java program to compare two numbers.
//        Input Data:
//        Input first integer: 25
//        Input second integer: 39
//        Expected Output
//        25 != 39
//        25 < 39
//        25 <= 39
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter first number");
//        int num1 = scanner.nextInt();
//
//        System.out.println("Enter second number");
//        int num2 = scanner.nextInt();
//
//        if (num1 != num2)
//            System.out.println(num1 + " is not equal to " + num2);
//        if (num1 < num2)
//            System.out.println(num1 + " is less than " + num2);
//        if (num1 <= num2) {
//            System.out.println(num1 + " is less than or equal to " + num2);
//        }
//       else
//            System.out.println("Out of comparison scope");

//        33. Write a Java program and compute the sum of an integer's digits.
//        Input Data:
//        Input an integer: 25
//        Expected Output
//
//        The sum of the digits is: 7
//        100
//
//        --first cycle--
//                number = 100;
//
//        int digit = 100/10 = 10 R 0;
//        digit = 0;
//
//        sum = 0;
//
//        number = 100/10 = 10;
//
//        --second cycle--
//        number = 10;
//
//        int digit = 10/10 = 1 R 0;
//        digit = 0;
//
//        sum = 0;
//
//        number = 1;
//
//        --last cycle--
//        number = 1;
//
//        digit = 1%10 = 1;
//
//        sum = 1;
//
//        number = 1/10 = 0;
//
//        break out of looP
//        SUM is 1

//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Input an integer: ");
//        int number = scanner.nextInt();
//
//        int sum = computeDigitSum(number);
//
//        System.out.println("Sum of the digits: " + sum);

//        34. Write a Java program to compute hexagon area.
//        Area of a hexagon = (6 * s^2)/(4*tan(π/6))
//        where s is the length of a side
//        Input Data:
//        Input the length of a side of the hexagon: 6
//        Expected Output
//
//        The area of the hexagon is: 93.53074360871938

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the hexagon: ");
        int hexLength = scanner.nextInt();

        double hexArea = ((6 * (hexLength*hexLength)) / (4*(Math.tan(Math.toDegrees(Math.PI/6)))));

        System.out.println("The area of the hexagon is : " + hexArea);









    }

//    public static int computeDigitSum(int number) {
//        int sum = 0;
//
//        while (number != 0) {
//            int digit = number % 10;
//            sum += digit;
//            number /= 10;
//        }
//
//        return sum;
//    }

}


//LESSON 31-40
//CHALLENGING ==> 17 - 30 (Very Hard)
