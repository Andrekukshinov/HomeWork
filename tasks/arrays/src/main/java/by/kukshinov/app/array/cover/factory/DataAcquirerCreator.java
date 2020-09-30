package by.kukshinov.app.array.cover.factory;

import by.kukshinov.app.array.cover.data.DataAcquirer;
import by.kukshinov.app.array.cover.data.impl.ConsoleDataAcquirer;
import by.kukshinov.app.array.cover.data.impl.FileDataAcquirer;
import by.kukshinov.app.array.cover.data.impl.RandomDataAcquirer;
import by.kukshinov.app.array.cover.enums.DataAcquirerType;
import by.kukshinov.app.array.cover.exception.NoSuchDataAcquirerTypeException;
import by.kukshinov.app.array.cover.util.parse.Parser;

public class DataAcquirerCreator {
    public DataAcquirer createDataAcquirer(DataAcquirerType type, String filePath, Parser parser){
        switch (type){
		  case FILE: return new FileDataAcquirer(filePath, parser);
		  case CONSOLE: return new ConsoleDataAcquirer(parser);
		  case RANDOM: return new RandomDataAcquirer();
		  default: throw  new NoSuchDataAcquirerTypeException();
	   }
    }
}
