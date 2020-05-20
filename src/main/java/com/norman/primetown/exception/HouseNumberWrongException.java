package com.norman.primetown.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST , reason = "Number is not right")
public class HouseNumberWrongException extends RuntimeException {
}
