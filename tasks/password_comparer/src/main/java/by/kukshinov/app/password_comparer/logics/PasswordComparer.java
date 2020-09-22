package by.kukshinov.app.password_comparer.logics;

import by.kukshinov.app.password_comparer.data.impl.FileDataAcquirer;

public class PasswordComparer {


    public PasswordComparer() {
    }

    public String comparePasswords(String userPass, String filePath) {
        String filePass = new FileDataAcquirer(filePath).getPassword();

        if (filePass.equals(userPass)) {
            return "Success!";
        }
        else throw new IllegalArgumentException("Password is incorrect!");
    }



}
