package by.kukshinov.app.password_comparer.util.impl;

import by.kukshinov.app.password_comparer.util.PasswordEncoder;

public class DumpPasswordEncoder implements PasswordEncoder {
    private static final int CODING_CONSTANT = 170;

    public String encode(String pass) {
        char[] tempPass = pass.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int runner = 0; runner < tempPass.length; ++runner) {
            result.append(tempPass[runner] + CODING_CONSTANT);
            result.append("_@");
        }
        return result.toString();
    }

    public String decode(String encodedPassword) {
        String[] separatedCharCodes = encodedPassword.split("_@");
        StringBuilder result = new StringBuilder();
        for (int runner = 0; runner < separatedCharCodes.length; ++runner) {
            result.append((char)(Integer.parseInt(separatedCharCodes[runner]) - CODING_CONSTANT));
        }
        return result.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
