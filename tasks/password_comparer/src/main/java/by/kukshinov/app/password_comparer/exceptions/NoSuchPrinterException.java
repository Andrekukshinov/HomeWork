package by.kukshinov.app.password_comparer.exceptions;

public class NoSuchPrinterException extends RuntimeException{
    public NoSuchPrinterException() {
    }

    public NoSuchPrinterException(String message, Throwable cause) {
        super(message, cause);
    }
}
