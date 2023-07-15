package com.daniel;


import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        1. Write a Java program to create a class called "Person" with a name and age
//        attribute. Create two instances of the "Person" class, set their attributes using
//        the constructor, and print their name and age.

//        Person daniel = new Person("Daniel Olasupo", 22);
//        Person judah = new Person("Judah Olasupo", 18);
//
//        System.out.println("Name: " + daniel.getName() + "\nAge: " + daniel.getAge());
//        System.out.println("Name: " + judah.getName() + "\nAge: " + judah.getAge());


//        2. Write a Java program to create a class called "Dog" with a name and breed attribute.
//        Create two instances of the "Dog" class, set their attributes using the constructor and
//        modify the attributes using the setter methods and print the updated values.

//          System.out.println("======DOG 1============");
//          Dog dalmatian = new Dog("Dingo", "Balmatian");
//          dalmatian.setName("Bingo");
//          dalmatian.setBreed("Dalmatian");
//          System.out.println("Name: " + dalmatian.getName() + "\nBreed: " + dalmatian.getBreed());
//
//          System.out.println("======DOG 2============");
//          Dog germanshepherd = new Dog("Druno", "gst");
//          germanshepherd.setName("Bruno");
//          germanshepherd.setBreed("German Shepherd Dog");
//          System.out.println("Name: " + germanshepherd.getName() + "\nBreed: " + germanshepherd.getBreed());

//          3. Write a Java program to create a class called "Rectangle" with width and
//          height attributes. Calculate the area and perimeter of the rectangle.
//            Rectangle rect = new Rectangle(40, 20);
//            System.out.println("The area of the rectangle: " + rect.rectArea());
//            System.out.println("The perimeter of the rectangle: " + rect.rectPerimeter());


//        4. Write a Java program to create a class called "Circle" with a radius attribute.
//        You can access and modify this attribute. Calculate the area and circumference of the circle.
//        Circle circle = new Circle(23);
//
//        DecimalFormat decimalFormat = new DecimalFormat("#.00");
//
//        System.out.println("The area of the circle: " + decimalFormat.format(circle.circleArea()) + " m2");
//        System.out.println("The perimeter of the circle: " + decimalFormat.format(circle.circlePerimeter()) + " m");


//        5. Write a Java program to create a class called "Book" with attributes for title,
//        author, and ISBN, and methods to add and remove books from a collection.

          Book book1 = new Book("Whispers of the Enchanted Forest", "Isabella Nightshade", "978-1-234567-89-0");
          Book.addBook(book1);
          Book book2 = new Book("Ephemeral Serenade", "Aiden Rivers", "978-0-987654-32-1");
          Book.addBook(book2);
          Book book3 = new Book("Chronicles of the Celestial Realm", "Luna Evergreen", "978-5-432109-87-6");
          Book.addBook(book3);

          ArrayList<Book> bookCollection = Book.getBookCollection();
          for (Book book : bookCollection)
              System.out.println(book.getTitle() + "---" + book.getAuthor() + "---" +book.getISBN());

    }




}








