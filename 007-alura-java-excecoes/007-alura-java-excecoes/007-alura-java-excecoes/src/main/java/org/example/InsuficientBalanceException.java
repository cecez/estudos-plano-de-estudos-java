package org.example;

public class InsuficientBalanceException extends RuntimeException {
    public InsuficientBalanceException(String message) {
        super(message);
    }
}
