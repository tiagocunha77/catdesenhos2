package pt.tiago.catdesenhos.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import pt.tiago.catdesenhos.exceptions.DesenhosNotFoundException;

@ControllerAdvice
public class DesenhosNotFoundAdvice {
	@ResponseBody
	@ExceptionHandler(DesenhosNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String desenhosNotFoundHandler(DesenhosNotFoundException ex) {
		return ex.getMessage();
	}
}