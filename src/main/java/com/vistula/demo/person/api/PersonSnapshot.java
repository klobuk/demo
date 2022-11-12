package com.vistula.demo.person.api;

import lombok.Value;

@Value(staticConstructor = "of")
public class PersonSnapshot {

  Integer id;
  String name;
  String surname;
  String city;

}
