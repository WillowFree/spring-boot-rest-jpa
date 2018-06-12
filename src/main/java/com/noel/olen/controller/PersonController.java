package com.noel.olen.controller;

import com.noel.olen.entity.Person;
import com.noel.olen.services.PersonService;
import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persons")
public class PersonController {

  @Autowired
  private PersonService personService;

  @RequestMapping(method = RequestMethod.GET)
  public Collection<Person> getAllPersons() {
    return personService.getAllPersons();
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public Person getPersonById(@PathVariable("id") Long id) {
    return personService.getPersonById(id);
  }

  @RequestMapping(value = "/findByLastName/{lastName}", method = RequestMethod.GET)
  public Person findByLastName(@PathVariable("lastName") String lastName) {
    return personService.findByLastName(lastName);
  }

  @RequestMapping(value = "/filterAge/{age}", method = RequestMethod.GET)
  public List<Person> findCustomPersons(@PathVariable("age") int age) {
    return personService.findCustomPersons(age);
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  public void removePersonById(@PathVariable("id") Long id) {
    personService.removePersonById(id);
  }

  @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
  public Person updatePerson(@RequestBody Person person) {
    return personService.updatePerson(person);
  }


  @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
  public Person insertPerson(@RequestBody Person person) {
    return personService.insertPerson(person);
  }
}
