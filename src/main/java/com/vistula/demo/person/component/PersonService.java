package com.vistula.demo.person.component;

import com.vistula.demo.person.api.PersonMissingException;
import com.vistula.demo.person.api.PersonSnapshot;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonService {

  private final PersonRepository repository;

  public PersonSnapshot find(Integer id) {
    Optional<PersonSnapshot> personSnapshot = repository.find(id).map(Person::snapshot);
    return personSnapshot.orElseThrow(() -> new PersonMissingException(id.toString()));
  }
}
