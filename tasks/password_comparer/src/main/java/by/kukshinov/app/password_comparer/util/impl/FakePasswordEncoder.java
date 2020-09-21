package by.kukshinov.app.password_comparer.util.impl;

import by.kukshinov.app.password_comparer.util.PasswordEncoder;

public class FakePasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(String pass) {
        return pass;
    }

    @Override
    public String decode(String encodedPassword) {
        return encodedPassword;
    }
}
