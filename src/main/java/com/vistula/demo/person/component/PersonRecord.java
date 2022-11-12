package com.vistula.demo.person.component;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Table(name = "person")
@AllArgsConstructor(staticName = "of")
class PersonRecord {

  @Id
  private Integer id;
  private String name;
  private String surname;
  private String city;

  public static PersonRecord of(Person person) {
    return of(
        person.getId(),
        person.getName(),
        person.getSurname(),
        person.getCity()
    );
  }

  Person toDomain() {
    return Person.of(
        id,
        name,
        surname,
        city
    );
  }
}
