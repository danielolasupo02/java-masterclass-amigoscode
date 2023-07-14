package com.daniel.person;

import static com.daniel.utils.StringUtils.isEmpty;

public class PersonService {
    //Business Logic To Ensure Person's Name is Not Blank
    public int addPerson(Person person){
        if (isEmpty(person.getName())) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        //Store person to database
        return 1;
    }
}
