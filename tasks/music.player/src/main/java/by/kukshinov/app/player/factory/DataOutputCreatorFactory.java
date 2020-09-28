package by.kukshinov.app.player.factory;

import by.kukshinov.app.player.enums.PrinterType;
import by.kukshinov.app.player.view.api.MusicDataPrinter;
import by.kukshinov.app.player.view.impl.ConsoleMusicDataPrinter;
import by.kukshinov.app.player.view.impl.FileMusicDataPrinter;

public class DataOutputCreatorFactory {
    public MusicDataPrinter createDataPrinter(PrinterType type, String file) {
        switch (type) {
		  case FILE: return new FileMusicDataPrinter(file);
		  case CONSOLE: return new ConsoleMusicDataPrinter();
		  default:throw new RuntimeException("NoMusicDataPrinterException");
	   }
    }

}
