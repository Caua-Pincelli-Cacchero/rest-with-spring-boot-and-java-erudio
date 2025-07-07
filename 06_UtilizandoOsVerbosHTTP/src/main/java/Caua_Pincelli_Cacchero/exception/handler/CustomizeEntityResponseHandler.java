package Caua_Pincelli_Cacchero.exception.handler;

import Caua_Pincelli_Cacchero.exception.ExceptionResoponse;
import Caua_Pincelli_Cacchero.exception.UnsupportedMathOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice
@RestController
public class CustomizeEntityResponseHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<ExceptionResoponse> handleAllExceptions(Exception ex, WebRequest request){
        ExceptionResoponse response = new ExceptionResoponse(
                new Date(),
                ex.getMessage(),
                request.getDescription(false));

        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @ExceptionHandler(UnsupportedMathOperation.class)
    public final ResponseEntity<ExceptionResoponse> handleBadRequestExceptions(Exception ex, WebRequest request){
        ExceptionResoponse response = new ExceptionResoponse(
                new Date(),
                ex.getMessage(),
                request.getDescription(false));

        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

}
