package com.vistula.demo.person.component;

import org.springframework.data.repository.CrudRepository;

public interface SpringPersonRepository extends CrudRepository<PersonRecord, Integer> {

}
