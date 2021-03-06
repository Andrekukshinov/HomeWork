package by.kukshinov.app.player.factory;

import by.kukshinov.app.player.enums.PrinterType;
import by.kukshinov.app.player.view.api.MusicDataPrinter;
import by.kukshinov.app.player.view.impl.FileMusicDataPrinter;
import org.junit.Assert;
import org.junit.Test;

public class DataOutputCreatorFactoryTest {
    @Test
    public void shouldGetRequiredDataOutputClass() {
	   MusicDataPrinter printer = new DataOutputCreatorFactory().createDataPrinter(PrinterType.FILE, "nothing here");

	   Assert.assertTrue(printer instanceof FileMusicDataPrinter);
    }
}
