package com.vistula.demo.person.api;

public class PersonMissingException extends Exception{

  public PersonMissingException(String errorId) {
    super("Nie znaleziono osoby o podanym id: "+errorId);
  }
}
