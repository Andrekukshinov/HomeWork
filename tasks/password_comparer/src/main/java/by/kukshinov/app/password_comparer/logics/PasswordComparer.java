package by.kukshinov.app.password_comparer.logics;

import by.kukshinov.app.password_comparer.data.DataAcquirer;
import by.kukshinov.app.password_comparer.data.impl.FileDataAcquirer;
import by.kukshinov.app.password_comparer.factories.PrinterFactory;
import by.kukshinov.app.password_comparer.factory_enums.Printers;
import by.kukshinov.app.password_comparer.util.PasswordEncoder;
import by.kukshinov.app.password_comparer.util.paths.FilePaths;

public class PasswordComparer {
    private final PasswordEncoder encoder;

    public PasswordComparer(PasswordEncoder encoder) {
        this.encoder = encoder;
    }

    public String comparePasswords(String userPass, String filePath) {
        String filePass = new FileDataAcquirer(filePath).getPassword();
        String userEncodedPassword = encoder.encode(userPass);
        if (filePass.equals(userEncodedPassword)) {
            return "Success!";
        }
        else throw new IllegalArgumentException("Password is incorrect!");
    }

    public PasswordEncoder getEncoder() {
        return encoder;
    }

}
