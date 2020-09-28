package by.kukshinov.app.player.factory;

import by.kukshinov.app.player.enums.PrinterType;
import by.kukshinov.app.player.view.api.MusicDataPrinter;
import by.kukshinov.app.player.view.impl.ConsoleMusicDataPrinter;
import by.kukshinov.app.player.view.impl.FileMusicDataPrinter;

public class DataOutputCreatorFactory {
    public MusicDataPrinter createDataPrinter(PrinterType type, String file) {
        switch (type) {
		  case CONSOLE: return new ConsoleMusicDataPrinter();
		  case FILE: return new FileMusicDataPrinter(file);
		  default:throw new RuntimeException("NoMusicDataPrinterException");
	   }
    }

}
