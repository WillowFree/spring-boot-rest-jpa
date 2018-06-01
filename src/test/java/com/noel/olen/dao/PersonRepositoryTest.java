package com.noel.olen.dao;


import com.noel.olen.entity.Person;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class PersonRepositoryTest {

  @Autowired
  @Qualifier()
  private PersonRepository personRepository;

  public void setUp() {
    personRepository.deleteAll();
  }

  @Test
  public void test() {
    Person person = new Person(1L, "prenom", "nom de famille");
    Person savedPerson = personRepository.save(person);

    Assertions.assertThat(savedPerson).isEqualTo(person);
  }


}