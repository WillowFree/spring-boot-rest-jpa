package com.noel.olen.services;

import com.noel.olen.entity.Person;
import com.noel.olen.repository.PersonRepository;
import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.dc.path.PathError;

@Service
public class PersonService {
  
  private PersonRepository personRepository;

//  @Qualifier("FakepersonDAO")
//  private FakepersonDAOImpl personRepository;

  protected PersonService() {
  }

  @Autowired
  public PersonService(PersonRepository personRepository) {
    this.personRepository = personRepository;
  }


  public Collection<Person> getAllPersons() {
    return personRepository.findAll();
  }

  public Person getPersonById(Long id) {
    return personRepository.getOne(id);
  }

  public void removePersonById(Long id) {
    personRepository.deleteById(id);
  }

  public Person updatePerson(Person person) {
    return personRepository.save(person);
  }

  public Person insertPerson(Person person) {
    return personRepository.save(person);
  }

  public Person findByLastName(String lastName) {
    return personRepository.findByLastName(lastName);
  }

  public List<Person>  findCustomPersons(int age) {
    return personRepository.findCustomPersons(age);
  }

}
