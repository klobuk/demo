package com.vistula.demo.person.http;

import com.vistula.demo.person.api.PersonSnapshot;
import com.vistula.demo.person.component.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GetPersonController {

  private final PersonService service;

  @GetMapping("person/get/{id}")
  PersonSnapshot get(@PathVariable Integer id) {
    return service.find(id);
  }
}