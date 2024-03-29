package com.rating.exeception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.rating.payload.ErrorMessageDTO;

@RestControllerAdvice
public class GlobalCustomeException {

	@ExceptionHandler(RatingNotFoundException.class)
	public ResponseEntity<ErrorMessageDTO> setCutomErrorMessage(RatingNotFoundException e) {
		ErrorMessageDTO errorMessageDTO = ErrorMessageDTO.builder().isSuccess(false).message(e.getMessage())
				.status(HttpStatus.NOT_FOUND).build();
		return new ResponseEntity<ErrorMessageDTO>(errorMessageDTO, HttpStatus.NOT_FOUND);
	}
}
