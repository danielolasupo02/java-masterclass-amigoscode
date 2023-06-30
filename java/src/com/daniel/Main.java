package com.daniel;

import java.util.Scanner;

public class Main {
    static String name = "Daniel Olasupo";

    public static void main(String[] args) {
        //56 EQUALS IGNORE CASE
//     Scanner scanner = new Scanner(System.in);
//     System.out.println("Enter you gender: ");
//     String gender = scanner.nextLine();
//     if (gender.equalsIgnoreCase("MALE") || gender.equalsIgnoreCase("FEMALE")) {
//         System.out.println("Valid gender");
//     }
//     else {
//         System.out.println("Invalid gender");
//     }




        //60 SWITCH CASE DEFAULT (AND BREAK STATEMENT)
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter grade: ");
//        char grade = 'A';
//
//        switch (grade) {
//            case 'A':
//                System.out.println("Excellent grade");
//                break;
//            case 'C':
//                System.out.println("Pass grade");
//                break;
//            case 'F':
//                System.out.println("Fail grade");
//                break;
//            default:
//                System.out.println("I don't know your grade G");
//
//        }

        //61 NEW SWITCH EXPRESSION WITH RETURN VALUE
//        char grade = 'd';
//        String result = switch(grade) {
//            case 'A' -> "Excellent";
//            case 'B' -> "Very Good";
//            case 'F' -> "Fail";
//            default -> "Advised to withdraw";
//        };
//
//        System.out.println(result);

        //63 PACKAGES
        //RIGHT CLICK ON SRC
        //CLICK OPEN IN
        //SELECT OPEN IN EXPLORER
//        Main main = new Main();
//
//        int sum = main.add(450, 500);
//        System.out.println(sum);
//
//        printBrand();
//
//        toUpperCase("DAniel OlasuPO");

//        isAdult(78);


    }

//    public int add(int x, int y) {
//        int result = x + y;
//        return result;
//    }
//
//    public static void printBrand() {
//        System.out.println("Daniel Olasupo Code");
//    }
//
//    public static void toUpperCase(String name) {
//        System.out.println(name.toUpperCase());
//    }

    public static void isAdult (int age) {
        if (age >= 18)
            System.out.println("You are an adult!!!");
        else {
            System.out.println("You are underaged!!!");
        }

    }

}

//56 - equalsignore => ignores case
//60 - SWITCH case DEFAULT with break statement
//61 - SWITCH case with return
//63 - PACKAGES --> CHECKING the file path for SOURCE folder
//64 - Creating a PACKAGE - It works like creating a folder to contain files
//   - but in this case we are working with Java files
//67 - CTRL + ALT + O ==> Shortcut to optimize imports

