package com.noel.olen.service;

import com.noel.olen.dao.FakePersonDAOImpl;
import com.noel.olen.entity.Person;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

  @Autowired
  @Qualifier("FakePersonDAO")
  private FakePersonDAOImpl personDAO;

  public Collection<Person> getAllPersons() {
    return personDAO.getAllPersons();
  }

  public Person getPersonById(Long id) {
    return personDAO.getPersonById(id);
  }

  public Collection<Person> removePersonById(Long id) {
    return personDAO.removePersonById(id);
  }

  public Person updatePerson(Person person) {
    return personDAO.updatePerson(person);
  }

  public Person insertPerson(Person person) {
    return personDAO.insertPerson(person);
  }
}
