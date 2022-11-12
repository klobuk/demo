package com.vistula.demo.person.component;

import com.vistula.demo.person.api.PersonSnapshot;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(staticName = "of")
@Getter
class Person {

  Integer id;
  String name;
  String surname;
  String city;

  public PersonSnapshot snapshot() {
    return PersonSnapshot.of(id, name, surname, city);
  }
}
