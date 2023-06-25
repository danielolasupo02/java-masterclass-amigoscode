package com.daniel;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
//        1. Write a Java program to print 'Hello' on screen and your name on a separate line.
//                Expected Output :
//        Hello
//        Alexandra Abramov
//        System.out.println("Hello \nAlexandra Abramov");

//        2. Write a Java program to print the sum of two numbers.
//        Test Data:
//        74 + 36
//        Expected Output :
//        110
//        System.out.println(74+36);

//        3. Write a Java program to divide two numbers and print them on the screen.
//        Test Data :
//        50/3
//        Expected Output :
//        16
//        System.out.println(50/3);

//        4. Write a Java program to print the results of the following operations.
//        Test Data:
//        a. -5 + 8 * 6
//        b. (55+9) % 9
//        c. 20 + -3*5 / 8
//        d. 5 + 15 / 3 * 2 - 8 % 3
//        Expected Output :
//        43
//        1
//        19
//        13
//        System.out.println(-5 + 8 * 6);
//        System.out.println((55+9) % 9);
//        System.out.println(20 + -3*5 / 8);
//        System.out.println(5 + 15 / 3 * 2 - 8 % 3);

//        5. Write a Java program that takes two numbers as input and displays the product of two numbers.
//                Test Data:
//        Input first number: 25
//        Input second number: 5
//        Expected Output :
//        25 x 5 = 125
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input first number: ");
//        int fnum = scanner.nextInt();
//
//
//        System.out.println("Input last number: ");
//        int lnum = scanner.nextInt();
//
//        System.out.println("Input first number: " + fnum);
//        System.out.println("Input second number: " + lnum);
//        System.out.println(fnum + " X " + lnum + " = " + fnum*lnum);
//
//        scanner.close();

//        6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
//                Test Data:
//        Input first number: 125
//        Input second number: 24
//        Expected Output :
//        125 + 24 = 149
//        125 - 24 = 101
//        125 x 24 = 3000
//        125 / 24 = 5
//        125 mod 24 = 5
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter first number:");
//        int fnum = scanner.nextInt();
//
//        System.out.println("Enter second number:");
//        int snum = scanner.nextInt();
//
//        System.out.println(fnum+snum);
//        System.out.println(fnum-snum);
//        System.out.println(fnum*snum);
//        System.out.println(fnum/snum);
//        System.out.println(fnum%snum);
//
//        scanner.close();

//        7. Write a Java program that takes a number as input and prints its multiplication table up to 10.
//        Test Data:
//        Input a number: 8
//        Expected Output :
//        8 x 1 = 8
//        8 x 2 = 16
//        8 x 3 = 24
//...
//        8 x 10 = 80

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter the number you'd like to see all its multiple: ");
//        int number = scanner.nextInt();
//
//        for (int i = 1; i <=10; i++)
//            System.out.println(number + " x " + i + " = " + number * i );

//        8. Write a Java program to display the following pattern.
//                Sample Pattern :
//
//        J    a   v     v  a
//        J   a a   v   v  a a
//        J  J  aaaaa   V V  aaaaa
//        JJ  a     a   V  a     a
//        System.out.println("   J    a   v     v  a                                                  ");
//        System.out.println("   J   a a   v   v  a a   ");
//        System.out.println("J  J  aaaaa   V V  aaaaa ");
//        System.out.println(" JJ  a     a   V  a     a");

//        9. Write a Java program to compute the specified expressions and print the output.
//                Test Data:
//        ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
//        Expected Output
//        2.138888888888889
// Scanner scanner = new Scanner(System.in);
//System.out.println("Enter the first number");
// double a = scanner.nextDouble();
//System.out.println("Enter the second number");
// double b = scanner.nextDouble();
//System.out.println("Enter the third number");
// double c = scanner.nextDouble();
//System.out.println("Enter the fourth number");
// double d = scanner.nextDouble();
// System.out.println((a * b - b * b) / (c - d));

//        10. Write a Java program to compute a specified formula.
//                Specified Formula :
//        4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
//        Expected Output
//        2.9760461760461765

//        System.out.println(4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));

//        11. Write a Java program to print the area and perimeter of a circle.
//                Test Data:
//        Radius = 7.5
//        Expected Output
//        Perimeter is = 47.12388980384689
//        Area is = 176.71458676442586

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter radius of circle: ");
//        double radius = scanner.nextDouble();
//        System.out.println("Perimeter of circle: " + 2*Math.PI*radius);
//        System.out.println("Radius of circle: " + Math.PI*radius*radius);

//       12. Write a Java program that takes three numbers as input to
//       calculate and print the average of the numbers.
//
//
//                Scanner scanner = new Scanner(System.in);
//
//                //collect all three inputs
//                System.out.println("Enter first number: ");
//                double fnum = scanner.nextDouble();
//                System.out.println("Enter second number: ");
//                double snum = scanner.nextDouble();
//                System.out.println("Enter third number: ");
//                double tnum = scanner.nextDouble();
//
//                //store the inputs in an array
//                double[] numbers = {fnum, snum, tnum};
//
//                //initialize the sum of the array to zero
//                double sum = 0;
//
//                //compute the length of the array
//                int size = numbers.length;
//
//                //loop through all the arrays and find their sum
//                for (double i = 0; i <= numbers.length; i++)
//                    sum += i;
//                System.out.println(sum);
//
//                //compute the average of the three numbers
//                double average = sum/size;
//                System.out.println(average);

//        13. Write a Java program to print the area and perimeter of a rectangle.
//                Test Data:
//        Width = 5.5 Height = 8.5
//        Expected Output
//        Area is 5.6 * 8.5 = 47.60
//        Perimeter is 2 * (5.6 + 8.5) = 28.20
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter the width of the rectangle: ");
//        float width = scanner.nextFloat();
//
//        System.out.println("Enter the height of the rectangle: ");
//        float height = scanner.nextFloat();
//
//        System.out.println("Area of rectangle: " + width*height);
//        System.out.println("Perimeter of rectangle: " + 2*(width+height));

//        14. Write a Java program to print an American flag on the screen.
//        Expected Output
//
//* * * * * * ==================================
// * * * * *  ==================================
//* * * * * * ==================================
// * * * * *  ==================================
//* * * * * * ==================================
// * * * * *  ==================================
//* * * * * * ==================================
// * * * * *  ==================================
//* * * * * * ==================================
//==============================================
//==============================================
//==============================================
//==============================================
//==============================================
//==============================================
//        System.out.println("* * * * * * ==================================");
//        System.out.println(" * * * * *  ==================================");
//        System.out.println("* * * * *  ==================================");
//        System.out.println(" * * * * *  ==================================");
//        System.out.println("* * * * * * ==================================");
//        System.out.println(" * * * * *  ==================================");
//        System.out.println("* * * * * * ==================================");
//        System.out.println(" * * * * *  ==================================");
//        System.out.println("* * * * * * ==================================");
//        System.out.println("==============================================");
//        System.out.println("==============================================");
//        System.out.println("==============================================");
//        System.out.println("==============================================");
//        System.out.println("==============================================");
//        System.out.println("==============================================");

//        15. Write a Java program to swap two variables.
//int a = 9;
//int b = 10;
//int c;
//c = a; //c = 9
//a = b; //a = 10
//b = c; //b = 9
//        System.out.println("New Value of a: " + a);
//        System.out.println("New Value of b: " + b);











    }

}

//LESSON 21-40
//Difference references and objects
//Pass by value with primitives
//Pass by value with references
//Looping Arrays