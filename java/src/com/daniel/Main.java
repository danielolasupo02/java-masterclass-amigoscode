package com.daniel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {



    public static void main(String[] args) {

//      String name1 = "Jamila";
//      String name2 = "Jamila";
//      String name3 = new String("Jamila");
//      String name4 = "Jamila";
//
//        System.out.println("STRING EQUALITY WITH '=='");
//        System.out.println(name1 == name2);
//        System.out.println(name3 == name4);
//        System.out.println("STRING CONTENTS EQUALITY WITH '.equals()'");
//        System.out.println(name1.equals(name2));
//        System.out.println(name3.equals(name4));


//      //String.valueOf() ==> this is used to convert an integer to a string
//      String num = String.valueOf(4);
//      System.out.println(num+1);
//
//      //String.format() ==> this is used to print strings in a
//      // certain format with %d and %s for integers and strings respectively
//      int age1 = 20;
//      int age2 = 21;
//      int age4 = 23;
//
//     String format1 =
//             String.format("Daniel is %d years old " +
//                     "\nJudah is %d years old " +
//                     "\nPraise is %d years old", age1, age2, age4);
//     System.out.println(format1);
//
//     //String.jon(a, b) ==> where 'a' is the delimiter and 'b' is the iterable array
//     String[] names = {"Tope", "JoseMaria", "Owele"};
//     System.out.println(String.join("--", names));


//       double num1 = 0.03;
//       double num2 = 0.02;
//        System.out.println(num1 - num2);
//
//        BigDecimal n1 = new BigDecimal("0.03");
//        BigDecimal n2 = new BigDecimal("0.02");
//        BigDecimal result = n1.subtract(n2);
//        System.out.println(result);


//        1. Write a Java program that throws an exception and catch it using a try-catch block.

//        try {
//            System.out.println(divideNumber(5, 0));
//
//        }
//        catch(ArithmeticException e) {
//            System.out.println("Error: " + e.getMessage());
//            e.printStackTrace();
//        }

//        2. Write a Java program to create a method that takes an integer as a parameter
//        and throws an exception if the number is odd.

//        try{
//            System.out.println("Even Number: " + oddTest(5));
//        }
//        catch (ArithmeticException e) {
//            System.out.println("Error: " + e.getMessage());
//            e.printStackTrace();
//        }

//        3. Write a Java program to create a method that reads a file and throws an exception if the file is not found.
//          try {
//
//              readFile("chelsea.txt");
//
//          }
//          catch (FileNotFoundException e) {
//              System.out.println("Error: " + e.getMessage());
//          }

//        4. Write a Java program that reads a list of numbers from a file and throws an exception if any of the numbers are positive.
//
//        try {
//            readFileNum("C:\\Users\\CSDC B. Analyst\\Documents\\chelsea.txt");
//        } catch (Exception e) {
//            System.out.println("Error: " + e.getMessage());
//            e.printStackTrace();
//        }

//        5. Write a Java program that reads a file and throws an exception if the file is empty.
//        try {
//            fileEmptyCheck("C:\\Users\\CSDC B. Analyst\\Documents\\chelsea.txt");
//        }
//        catch(Exception e) {
//            System.out.println("Error: " + e);
//            e.printStackTrace();
//        }


    }

        //Q1 METHOD
//        public static int divideNumber(int n1, int n2) {
//        if (n2 == 0) {
//            throw new ArithmeticException("Cannot divide by zero!");
//        }
//        return n1 / n2;
//        }


        //Q2 METHOD
//    public static int oddTest (int num) {
//        if (num%2 != 0) {
//            throw new ArithmeticException("Odd Number");
//        }
//        return num;
//    }

       //Q3 METHOD
//    public static void readFile(String filename) throws FileNotFoundException {
//        File file = new File(filename);
//        Scanner scanner = new Scanner(file);
//
//        //Scan and process the next line
//        while (scanner.hasNextLine()) {
//         String line =  scanner.nextLine();
//            System.out.println(line);
//        }
//
//        scanner.close();
//    }

       //Q4 METHOD
//      public static void readFileNum(String fname) throws FileNotFoundException {
//        File file = new File(fname);
//        Scanner scanner = new Scanner(file);
//
//        while (scanner.hasNextLine()){
//            String line = scanner.nextLine();
//            int num = parseInt(line);
//            if(num%2 == 0) {
//                throw new ArithmeticException("Even number found: " + num + "\nPlease Even numbers are not allowed");
//            }
//            System.out.println(line);
//
//        }
//
//      }

    //Q5 METHOD
//    public static void fileEmptyCheck (String filename) throws IOException {
//        File file = new File(filename);
//        Scanner scanner = new Scanner(file);
//
//        List<String> lines = Files.readAllLines(Paths.get(filename));
//        if (lines.isEmpty())
//            throw new IOException("File is empty");
//        else {
//            System.out.println("File is not empty!!!");
//        }
//    }

    }








