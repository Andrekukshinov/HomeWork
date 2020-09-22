package by.kukshinov.app.password_comparer;

import by.kukshinov.app.password_comparer.factories.PrinterFactory;
import by.kukshinov.app.password_comparer.factory_enums.Printers;
import by.kukshinov.app.password_comparer.logics.PasswordComparer;
import by.kukshinov.app.password_comparer.view.DataPrinter;

import static by.kukshinov.app.password_comparer.util.paths.FilePaths.*;

public class Main {
    public static void main(String[] args) {
        PasswordComparer comparer = new PasswordComparer();
        String result = comparer.comparePasswords(args[0], RESOURCE_PASSWORDS);

        // second argument is required here 4 changing password in destination file,
        // and path of this file is given here
        // but if CONSOLE option is used, this source path is not used.
        DataPrinter printer = PrinterFactory.createDataPrinter(Printers.CONSOLE, RESOURCE_PASSWORDS);
        printer.printData(result);
    }
}
