package ru.skillbox.diplom.group40.social.network.impl.resource.advice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import ru.skillbox.diplom.group40.social.network.impl.exception.NotFoundException;

@ControllerAdvice
public class AdviceController {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<String> handleException(NotFoundException e) {
        return ResponseEntity.status(401).body(e.getMessage());
    }

}
