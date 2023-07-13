package com.daniel.person;

public class PersonService {
    //Business Logic To Ensure Person's Name is Not Blank
    public int addPerson(Person person){
        if (person.getName().isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        //Store person to database
        return 1;
    }
}
