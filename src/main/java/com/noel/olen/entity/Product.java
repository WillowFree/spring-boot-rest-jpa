package com.noel.olen.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;

@Entity
@AllArgsConstructor
public class Product {

  @Id
  @GeneratedValue
  private long id;

  private String description;

}
