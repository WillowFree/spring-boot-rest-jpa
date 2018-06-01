package com.noel.olen.dao;

import com.noel.olen.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
/*
  Collection<Person> getAllPersons();

  Person getPersonById(Long id);

  Collection<Person> removePersonById(Long id);

  Person updatePerson(Person person);

  Person insertPerson(Person person);
  */
}
