package com.vistula.demo.person.component;

import java.util.Optional;

public interface PersonRepository {

  Optional<Person> find(Integer id);

}
