package com.norman.primetown.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND , reason = "House id not found")
public class HouseIdNotFoundException extends RuntimeException {
}
