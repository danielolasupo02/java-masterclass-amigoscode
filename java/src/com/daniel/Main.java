package com.daniel;
import java.awt.Point;


public class Main {
    public static void main(String[] args) {
//        //primitives
//
//        //integers
//        int num1 = 20;
//        int num2 = 50;
//        int result = num1 + num2;
//        System.out.println(result);
//
//        //double
//        double pi = 3.14;
//        System.out.println(pi);
//
//        //boolean
//        boolean isAdult = true;
//        System.out.println(isAdult);
//
//        //character
//        char thirdLetter = 'c';
//        System.out.println(thirdLetter);
//
//        //byte
//        byte b = 127;
//        System.out.println(b);

//        //NUMBER READABILITY
//        //using underscores for readability of large numbers
//        int billion = 1_000_000_008;//9 zeros implies integer data type
//        System.out.println(billion);

//        //ARITHMETIC OPERATIONS
//        int num1_ = 9;
//        int num2_ = 18;
//        System.out.println(num1_ + num2_);
//        System.out.println(num1_ - num2_);
//        System.out.println(num1_ * num2_);
//        System.out.println(num2_ / num1_);
//        System.out.println(num2_ % num1_);

//        //PRE INCREMENT OPERATOR
//        int g = 10;
//        int h = 20;
//        System.out.println(--g);//result is 9
//        System.out.println(++h);//result is 21

//        //POST INCREMENT OPERATOR
//        int g = 10;
//        int h = 20;
//        System.out.println(g--);//result is 10
//        System.out.println(h++);//result is 20


//        //BLANK WORD, EMPTY WORD, AND SUBSTRING
//         String fname = "Daniel";
//         String lname = "Olasupo";
//         String blankWord = " ";
//         String emptyWord = "";
//        System.out.println(blankWord.isBlank());//returns true because it contains a blank space
//        System.out.println(emptyWord.isEmpty());//returns true because it contains no character
//        System.out.println((fname + " " + lname).substring(0, 14));//outputs the 14 characters in the sequence
//        System.out.println("   a   ".trim());//trims all whitespaces in the character sequence


//        //Pass by value
//        //Example 1
//        int age = 21;
//        int ageCopy = age;
//        System.out.println(age);//result in the stack is 21
//        System.out.println(ageCopy);//value of age is passed to ageCopy but changing the value of age won't affect ageCopy

          //Example 2
//          int age = 21;
//          int ageCopy = increment(age);
//          System.out.println(ageCopy);

//          //Pass by value with objects
//          System.out.println("Daniel Olasupo");
//
//          Point pointA = new Point(10, 20);
//          Point pointB = pointA;
//          //Point A & B still point to same object
//          pointA.x = 100;
//          pointB.y = 90;
//
//          System.out.println(pointA);//java.awt.Point[x=100,y=90]
//          System.out.println(pointB);//java.awt.Point[x=100,y=90]
//
//          //Point A & B point to different objects now because Point B creates a brand new object
//          pointB = new Point(80, 190);
//          System.out.println(pointA);//java.awt.Point[x=100,y=90]
//          System.out.println(pointB);//java.awt.Point[x=80,y=190]

            //Arrays
            //looping through an array of numbers
//            int[] num = new int[3];
//            num[1] = 1;
//            num[2] = 2;
//            for (int i :  num) {
//                System.out.println(i);
//            }

//            //looping through an array of numbers
//            int[] numbers = {1, 2, 3, 4, 5, 6};
//            for (int i : numbers) {
//                System.out.println(i);
//            }

//              //looping through an array of strings
//              String[] siblings = {"Toyin","David", "Praise", "Daniel", "Judah"};
//              for (String i : siblings) {
//                  System.out.println(i);
//              }




    }
    //meant to be placed outside the main method
    //function to increase age by 1
//    static int increment(int age) {
//        return ++age;
//    }
}

//LESSON 21-40
//Difference references and objects
//Pass by value with primitives
//Pass by value with references
//Looping Arrays