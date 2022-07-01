package one.digitalinnovation.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerStockIsZeroException extends  Exception {
    public BeerStockIsZeroException(Long id) {
        super(String.format("Failed to decrement stock of ID %s since he has zero beers on it", id));
    }
}
