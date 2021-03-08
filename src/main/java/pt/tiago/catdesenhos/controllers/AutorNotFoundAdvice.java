package pt.tiago.catdesenhos.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import pt.tiago.catdesenhos.exceptions.AutorNotFoundException;

@ControllerAdvice
public class AutorNotFoundAdvice {

  @ResponseBody
  @ExceptionHandler(AutorNotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  String autorNotFoundHandler(AutorNotFoundException ex) {
    return ex.getMessage();
  }
}