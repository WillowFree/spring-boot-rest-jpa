package com.noel.olen.repository.impl;

/**
 * Avec Java 7, la valeur des types entiers (byte, short, int, et long) peut être exprimée dans le
 * système binaire en utilisant le préfixe 0b ou 0B
 */

import com.noel.olen.entity.Person;
import com.noel.olen.repository.impl.FakePersonDAOImpl;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

@Ignore
public class FakePersonDAOImplTest {

  @Autowired
  private FakePersonDAOImpl fakePersonDAO;

  @Test
  public void getAllPersons() {
    fakePersonDAO.getAllPersons();
  }

  @Test
  public void getPersonById() {
    Long idPerson = 1L;
    fakePersonDAO.getPersonById(idPerson);
  }

  @Test
  public void removePersonById() {
    Long idPersonToRemove = 1L;
    fakePersonDAO.removePersonById(idPersonToRemove);
  }

  @Test
  public void updatePerson() {

    Person person = new Person(1L, "prenom", "nom", 20);
    fakePersonDAO.updatePerson(person);
  }

  @Test
  public void insertPerson() {
  }
}