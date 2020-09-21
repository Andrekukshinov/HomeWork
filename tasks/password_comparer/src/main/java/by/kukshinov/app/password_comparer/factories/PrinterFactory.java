package by.kukshinov.app.password_comparer.factories;

import by.kukshinov.app.password_comparer.exceptions.NoSuchPrinterException;
import by.kukshinov.app.password_comparer.factory_enums.Printers;
import by.kukshinov.app.password_comparer.view.DataPrinter;
import by.kukshinov.app.password_comparer.view.impl.ConsolePrinter;
import by.kukshinov.app.password_comparer.view.impl.FilePrinter;

public class PrinterFactory {
    public static DataPrinter createDataPrinter(Printers factory, String filePath) {
        switch (factory){
            case FILE: return new FilePrinter(filePath);
            case CONSOLE: return new ConsolePrinter();
            default: throw new NoSuchPrinterException();
        }
    }
}
