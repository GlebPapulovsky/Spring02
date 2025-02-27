package ru.netology.springBootDemo.Advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ru.netology.springBootDemo.Exceptions.InvalidCredentials;
import ru.netology.springBootDemo.Exceptions.UnauthorizedUser;

@RestControllerAdvice
public class ExceptionHandlerAdvice {


    @ExceptionHandler(InvalidCredentials.class)
    public ResponseEntity<String> rtHandler(InvalidCredentials ex) {
        return new ResponseEntity<>("InvalidCredentialsException", HttpStatus.I_AM_A_TEAPOT);
    }
    @ExceptionHandler(UnauthorizedUser.class)
    public ResponseEntity<String> uuHandler(UnauthorizedUser ex) {
        return new ResponseEntity<>("UnauthorizedUserException", HttpStatus.I_AM_A_TEAPOT);//HttpStatus.UNAUTHORIZED);
    }
}
