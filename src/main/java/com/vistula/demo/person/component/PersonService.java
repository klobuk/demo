package com.vistula.demo.person.component;

import com.vistula.demo.person.api.PersonSnapshot;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonService {

  private final PersonRepository repository;

  public Optional<PersonSnapshot> find(Integer id) {
    return repository.find(id).map(Person::snapshot);
  }
}
