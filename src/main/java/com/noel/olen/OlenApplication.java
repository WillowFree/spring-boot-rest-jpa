package com.noel.olen;

import com.noel.olen.entity.Person;
import com.noel.olen.repository.AddressRepository;
import com.noel.olen.entity.Address;
import com.noel.olen.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class OlenApplication {

  @Autowired
  private AddressRepository addressRepository;

  @Autowired
  private PersonRepository personRepository;

  public static void main(String[] args) {
    SpringApplication.run(OlenApplication.class, args);
  }

  @Component
  class DataSetUp implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {

      Address alleray = new Address(1L, 6, "rue d'alleray", 75015, "Paris");
      addressRepository.save(alleray);
      Address sevres = new Address(2L, 45, "rue de sèvres", 75006, "Paris");
      addressRepository.save(sevres);

      Person noel = new Person(1L, "Noel", "DAO", 43);
      noel.addAdresse(sevres);
      noel.addAdresse(alleray);
      personRepository.save(noel);

      Person amelie = new Person(2L, "Amelie", "GILLETTE", 37);
      amelie.addAdresse(sevres);
      personRepository.save(amelie);
    }
  }
}
