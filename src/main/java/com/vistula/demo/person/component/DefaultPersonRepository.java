package com.vistula.demo.person.component;

import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DefaultPersonRepository implements PersonRepository{

  private final SpringPersonRepository springPersonRepository;

  @Override
  public Optional<Person> find(Integer id) {
    return springPersonRepository.findById(id).map(PersonRecord::toDomain);
  }
}
