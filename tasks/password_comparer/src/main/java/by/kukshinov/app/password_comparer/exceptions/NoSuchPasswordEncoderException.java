package by.kukshinov.app.password_comparer.exceptions;

public class NoSuchPasswordEncoderException extends RuntimeException {
    public NoSuchPasswordEncoderException(String massage, Exception e) {
        super(massage, e);
    }

    public NoSuchPasswordEncoderException() {
    }
}
