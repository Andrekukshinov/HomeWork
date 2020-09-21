package by.kukshinov.app.password_comparer.printer;

import by.kukshinov.app.password_comparer.factories.PasswordEncoderFactory;
import by.kukshinov.app.password_comparer.factories.PrinterFactory;
import by.kukshinov.app.password_comparer.view.DataPrinter;
import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static by.kukshinov.app.password_comparer.factory_enums.Encoders.*;
import static by.kukshinov.app.password_comparer.factory_enums.Printers.FILE;
import static by.kukshinov.app.password_comparer.util.paths.FilePaths.TEST_RESOURCE_PASSWORDS;

public class FilePrinterTest {
    private String readFromFile(String filePath) {
        String stringFromFile = "";
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filePath));
            stringFromFile = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return stringFromFile;
    }

    @Test
    public void testFilePrinter() {
        //given
        String data = "pA$$worD";
        DataPrinter factoryPrinter = PrinterFactory.createDataPrinter(FILE, TEST_RESOURCE_PASSWORDS);
        String finalOption = PasswordEncoderFactory.createEncoder(DUMP).encode(data);
        String stringFromFile = readFromFile(TEST_RESOURCE_PASSWORDS);
        //when
        factoryPrinter.printData(data);
        //then
        Assert.assertEquals(finalOption, stringFromFile);
    }
}
