package com.daniel.oopsconceptquiz;


import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

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

//          Book book1 = new Book("Whispers of the Enchanted Forest", "Isabella Nightshade", "978-1-234567-89-0");
//          Book.addBook(book1);
//          Book book2 = new Book("Ephemeral Serenade", "Aiden Rivers", "978-0-987654-32-1");
//          Book.addBook(book2);
//          Book book3 = new Book("Chronicles of the Celestial Realm", "Luna Evergreen", "978-5-432109-87-6");
//          Book.addBook(book3);
//
//          ArrayList<Book> bookCollection = Book.getBookCollection();
//          for (Book book : bookCollection)
//              System.out.println(book.getTitle() + "---" + book.getAuthor() + "---" +book.getISBN());

//        6. Write a Java program to create a class called "Employee" with a name, job title,
//        and salary attributes, and methods to calculate and update salary.

//          Employee daniel = new Employee("Daniel Olasupo", "Software Engineer", 750_000);
//          daniel.increaseSalary(100000);
//          daniel.decreaseSalary(400000);
//          System.out.println("Staff Name: " + daniel.getName() + "\nJob Title: " + daniel.getJobtitle() + "\nSalary: " + daniel.getSalary());

//        7. Write a Java program to create a class called "Bank" with a collection of accounts and methods
//        to add and remove accounts, and to deposit and withdraw money. Also define a class called
//        "Account" to maintain account details of a particular customer.

//        Bank bank = new Bank();
//        Account acc1 = new Account("Daniel Olasupo", 1000001, 5000);
//        Account acc2 = new Account("Joel Egbuzobi", 1000002, 4000);
//        Account acc3 = new Account("Collins Ikedinachim", 1000003, 4500);
//        bank.accountList.add(acc1);
//        bank.accountList.add(acc2);
//        bank.accountList.add(acc3);
//
//        bank.depositMoney(acc1, 11000);
//        acc1.getAccountDetails();
//        bank.depositMoney(acc2, 11000);
//        acc2.getAccountDetails();
//        bank.depositMoney(acc3, 11000);
//        acc3.getAccountDetails();

//        8. Write a Java program to create class called "TrafficLight" with attributes
//        for color and duration, and methods to change the color and check for red or green.

//        TrafficLight light1 = new TrafficLight("Green", 12);
//        light1.checkTrafficLight();
//
//        TrafficLight light2 = new TrafficLight("Red", 134);
//        light2.checkTrafficLight();
//
//        TrafficLight light3 = new TrafficLight("Yellow", 15);
//        light3.checkTrafficLight();

//        9. Write a Java program to create a class called "Employee" with a name,
//        salary, and hire date attributes, and a method to calculate years of service.
//            Employeee emp1 = new Employeee("Daniel Olasupo", 50000, LocalDate.parse("2007-05-02"));
//
//            Employeee emp2  = new Employeee("Jose-Maria Obi", 70000, LocalDate.parse("2015-05-02"));
//
//            Employeee emp3  = new Employeee("Joel Egbuzobi", 85000, LocalDate.parse("2018-05-02"));
//            emp1.showServiceDetails();
//            emp2.showServiceDetails();
//            emp3.showServiceDetails();



//        10. Write a Java program to create a class called "Student" with a
//        name, grade, and courses attributes, and methods to add and remove courses

//        Student student1 = new Student("Daniel Olasupo", 89);
//        student1.addCourse("MAT111");
//        student1.addCourse("MAT112");
//        student1.addCourse("CHM111");
//        student1.addCourse("CHM122");
//        student1.addCourse("PHY111");
//        student1.addCourse("PHY111");
//        student1.regDetails();




//        11. Write a Java program to create a class called "Library" with a
//        collection of books and methods to add and remove books.

//        Boook book1 = new Boook("Far from Home", "Daniel Olasupo", "929-903-001-234");
//        Library library = new Library();
//        library.addBook(book1);
//        library.printBookDetails(book1);


//        12. Write a Java program to create a class called "Airplane" with a
//        flight number, destination, and departure time attributes, and methods to
//        check flight status and delay.
//          Airplane attendant1 = new Airplane("LOS-101", "LDN");
//          Date specificDate = new Date();
//
//          attendant1.setDepartureTime(specificDate);
//          attendant1.printFlightDetails();

//        13. Write a Java program to create a class called "Inventory" with a
//        collection of products and methods to add and remove products, and to
//        check for low inventory.

//          String product1Desc = "\n The SuperWidget 2000 is a cutting-edge gadget \n that combines multiple functions \n into one sleek device.";
//          Product product1 = new Product("SuperWidget-2000", product1Desc, 4, 99.99);
//          Inventory inventory = new Inventory();
//          inventory.addProduct(product1);
//          inventory.showDetails(product1);


//        14. Write a Java program to create a class called "School" with attributes
//        for students, teachers, and classes, and methods to add and remove students
//        and teachers, and to create classes.












    }




}








