package by.kukshinov.app.password_comparer.util;

public interface PasswordEncoder {
    String encode(String pass);
    String decode(String encodedPassword);
}
