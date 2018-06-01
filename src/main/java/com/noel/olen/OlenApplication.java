package com.noel.olen;

import com.noel.olen.dao.AddressRepository;
import com.noel.olen.entity.Address;
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

  public static void main(String[] args) {
    SpringApplication.run(OlenApplication.class, args);
  }

  @Component
  class DataSetUp implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
      addressRepository.save(new Address(1L, 6, "rue d ALLERAY", 75015, "Paris"));
    }
  }
}
