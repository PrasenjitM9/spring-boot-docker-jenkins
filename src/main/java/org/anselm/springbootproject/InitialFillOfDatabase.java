package org.anselm.springbootproject;

import org.anselm.springbootproject.entity.Person;
import org.anselm.springbootproject.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitialFillOfDatabase implements CommandLineRunner {

    @Autowired
    PersonService personService;

    @Override
    public void run(String... args) throws Exception {
        personService.saveUpdatePerson(new Person(0L, "first_name", "last_name"));
    }
}