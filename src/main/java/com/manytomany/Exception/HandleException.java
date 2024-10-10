package com.manytomany.Exception;

import com.manytomany.dto.ErrorDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class HandleException {

    @ExceptionHandler
    public ResponseEntity<ErrorDto> handle(ResourceNotFoundException r){
        ErrorDto dto=new ErrorDto(r.getMessage());
        return new ResponseEntity<>(dto, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
