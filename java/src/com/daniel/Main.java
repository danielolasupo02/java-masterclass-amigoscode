package com.daniel;

import java.io.*;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {



    public static void main(String[] args)  {

  //VIDEO 129 EXCERCISE
        //Create a file named "hello.txt" and then write a message to it saying "Hello World!!!"
        //Overriding message should not be allowed i.e. you can write messaged multiple times without
        //previous messages getting overridden

//        try {
//            File file = createFile("C:\\Users\\CSDC B. Analyst\\Documents\\hello.txt");
//            writeToFile(file);
//
//        }
//        catch(Exception e) {
//            System.out.println("Error: " + e.getMessage());
//            e.printStackTrace();
//        }

        //VIDEO 130 EXCERCISE
        //Write a java code that reads the data in the file created in the previous activity
//        try{
//        readFile("C:\\Users\\CSDC B. Analyst\\Documents\\hello.txt");
//        }
//        catch (IOException e){
//            System.out.println("Error: " + e.getMessage());
//            e.printStackTrace();
//        }

        //VIDEO 131 EXERCISE - try resources

//        try {
//            File file = createFile("C:\\Users\\CSDC B. Analyst\\Documents\\hello.txt");
//            writeToFile(file);
//
//        }
//        catch(Exception e) {
//            System.out.println("Error: " + e.getMessage());
//            e.printStackTrace();
//        }
    }

//VIDEO 129 METHOD
//    public static File createFile(String filepath){
//        try {
//            File file = new File(filepath);
//            if(!file.exists())
//                file.createNewFile();
//            return file;
//        }
//        catch (IOException e) {
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//            throw new IllegalStateException("Illegal State Exception");
//
//        }
//    }
//
//    public static void writeToFile(File file) throws IOException {
//        FileWriter fw = new FileWriter(file, true);
//        PrintWriter pw = new PrintWriter(fw);
//        pw.println("Jose Maria");
//        pw.println("Hate you");
//        pw.flush();
//        pw.close();
//    }

    //VIDEO 130 METHOD

//    public static File readFile(String filepath) throws FileNotFoundException {
//        File file = new File(filepath);
//        Scanner scanner = new Scanner(file);
//
//        while(scanner.hasNextLine()) {
//            System.out.println(scanner.nextLine());
//        }
//
//        return file;
//    }

    //VIDEO 131 METHOD
//    public static File createFile(String filepath){
//
//
//        try {
//            File file = new File(filepath);
//            if(!file.exists())
//                file.createNewFile();
//            return file;
//        }
//        catch (IOException e) {
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//            throw new IllegalStateException("Illegal State Exception");
//
//        }
    }

//    public static void writeToFile(File file) throws IOException {
//        try(       FileWriter fw = new FileWriter(file, true);
//                   PrintWriter pw = new PrintWriter(fw);){
//
//            pw.println("Jose Maria");
//            pw.println("Hate you");
//        }
//        catch(IOException e) {
//            System.out.println("Error: " + e.getMessage());
//        }

//        try{
//            FileWriter fw = new FileWriter(file, true);
//            PrintWriter pw = new PrintWriter(fw);
//            pw.println("Jose Maria");
//            pw.println("Hate you");
//            pw.flush();
//            pw.close();
//        }
//        catch(IOException e) {
//            System.out.println("Error: " + e.getMessage());
//        }

    }


}








