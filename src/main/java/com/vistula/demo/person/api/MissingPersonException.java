package com.vistula.demo.person.api;

public class MissingPersonException extends RuntimeException{

  public MissingPersonException(Integer id) {
    super("Nie znaleziono osoby o podanym id: "+id);
  }
}
