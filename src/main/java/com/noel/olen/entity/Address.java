package com.noel.olen.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.ToString;

@Data
//@Builder(builderMethodName = "builder")
//@NoArgsConstructor
@Entity
@ToString
public class Address {

  public Address() {
  }

  public Address(Long id, @NotNull Integer numero,
      @NotNull String rue, @NotNull Integer codePostale,
      @NotNull String ville) {

    this.id = id;
    this.numero = numero;
    this.rue = rue;
    this.codePostale = codePostale;
    this.ville = ville;
  }

  @Id
  @GeneratedValue
  private Long id;


  @NotNull
  private Integer numero;

  @NotNull
  private String rue;

  @NotNull
  private Integer codePostale;

  @NotNull
  private String ville;

}
