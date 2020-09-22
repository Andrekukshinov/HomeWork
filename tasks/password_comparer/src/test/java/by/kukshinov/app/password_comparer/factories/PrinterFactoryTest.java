package by.kukshinov.app.password_comparer.factories;

import by.kukshinov.app.password_comparer.view.DataPrinter;
import by.kukshinov.app.password_comparer.view.impl.FilePrinter;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static by.kukshinov.app.password_comparer.factory_enums.Printers.*;
import static by.kukshinov.app.password_comparer.util.paths.FilePaths.*;

public class PrinterFactoryTest {
    @Test
    public void testPrinterFromFactoryEqualsToConstructedPrinter() {
        //given
        DataPrinter constructorPrinter = new FilePrinter(TEST_RESOURCE_PASSWORDS);
        //when
        DataPrinter factoryPrinter = PrinterFactory.createDataPrinter(FILE, TEST_RESOURCE_PASSWORDS);
        //then
        Assert.assertEquals(constructorPrinter, factoryPrinter);
    }
}
