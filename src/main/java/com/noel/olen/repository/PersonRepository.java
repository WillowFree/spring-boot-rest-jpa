package com.noel.olen.repository;

import com.noel.olen.entity.Person;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PersonRepository extends JpaRepository<Person, Long> {

  Person findByLastName(String lastName);


  @Query("select p from Person p where p.age < ?1 ")
  List<Person> findCustomPersons(int age);

/*
  Collection<Person> getAllPersons();

  Person getPersonById(Long id);

  Collection<Person> removePersonById(Long id);

  Person updatePerson(Person person);

  Person insertPerson(Person person);
  */

}
