package com.noel.olen.repository.impl;

import com.noel.olen.entity.Person;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;


@Repository
@Qualifier("FakePersonDAO")
public class FakePersonDAOImpl /*implements PersonRepository */ {

  private static Map<Long, Person> persons = new HashMap<>();

  static {
    Person noel = new Person(1L, "Noel", "DAO", 43);
    persons.put(noel.getId(), noel);

    Person amelie = new Person(2L, "Amelie", "GILLETTE", 37);
    persons.put(amelie.getId(), amelie);
  }

  //  @Override
  public Collection<Person> getAllPersons() {
    return persons.values();
  }

  //  @Override
  public Person getPersonById(Long id) {
    return persons.get(id);
  }

  //  @Override
  public Collection<Person> removePersonById(Long id) {
    persons.remove(id);
    return persons.values();
  }

  //  @Override
  public Person updatePerson(Person person) {
    Person storedPerson = persons.get(person.getId());

    storedPerson.setFirstName(person.getFirstName());
    storedPerson.setLastName(person.getLastName());
    return storedPerson;
  }

  //  @Override
  public Person insertPerson(Person person) {
    return persons.put(person.getId(), person);
  }
}
