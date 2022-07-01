package one.digitalinnovation.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerStockBelowZeroException extends  Exception {
    public BeerStockBelowZeroException(Long id, int quantityToDecrement ) {
        super(String.format("Stock of id %s cannot be decremented: amount of %s makes stock goes below zero", id, quantityToDecrement));
    }
}
