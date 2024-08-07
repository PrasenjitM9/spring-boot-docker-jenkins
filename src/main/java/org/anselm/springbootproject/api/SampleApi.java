package org.anselm.springbootproject.api;

import org.anselm.springbootproject.entity.Person;
import org.anselm.springbootproject.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SampleApi {

    @Autowired
    PersonService personService;

    @GetMapping({"/hello", "/hello/{name}"})
    @ResponseBody
    public String returnHello(@PathVariable(required = false) String name, @RequestParam String greeting) {
        if(name == null ) {
            name = "";
        }
        return "Hello " + name + "! "  + greeting;
    }

    @GetMapping("/persons")
    public List<Person> getPersons() {
        return personService.getAllPersons();
    }

    @PostMapping(
            value = "/createPerson", consumes = "application/json", produces = "application/json")
    public Person createPerson(@RequestBody Person person) {
        return personService.saveUpdatePerson(person);
    }
}
