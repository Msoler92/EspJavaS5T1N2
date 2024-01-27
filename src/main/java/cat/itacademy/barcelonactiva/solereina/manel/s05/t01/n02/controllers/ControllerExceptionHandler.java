package cat.itacademy.barcelonactiva.solereina.manel.s05.t01.n02.controllers;

import cat.itacademy.barcelonactiva.solereina.manel.s05.t01.n02.model.dto.FlowerDTO;
import cat.itacademy.barcelonactiva.solereina.manel.s05.t01.n02.model.exceptions.IdNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ControllerExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(IdNotFoundException.class)
    protected ResponseEntity<FlowerDTO> handleIdNotFound() {
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }
}
