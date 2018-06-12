package com.noel.olen;

import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertThat;

import com.noel.olen.repository.AddressRepository;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OlenApplicationTests {

  @Autowired
  private AddressRepository addressRepository;

  @Test
  public void contextLoads() {
  }

  @Test
  public void persistenceWorks() {
    assertThat(addressRepository.findAll(), not(Matchers.emptyIterable()));
  }

}
