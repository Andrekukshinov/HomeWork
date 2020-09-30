package by.kukshinov.app.array.cover.data.impl;

import by.kukshinov.app.array.cover.data.DataAcquirer;
import by.kukshinov.app.array.cover.util.parse.Parser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileDataAcquirer implements DataAcquirer {
    private final String FILE_PATH;
    private final Parser parser;

    public FileDataAcquirer(String filePath, Parser parser) {
	   FILE_PATH = filePath;
	   this.parser = parser;
    }

    @Override
    public int[] getData() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))){
            String source = reader.readLine();
		  return parser.stringCommaSpaceSplitter(source);
	   } catch (FileNotFoundException e) {
		  throw new RuntimeException(e);
	   } catch (IOException e) {
		  throw new RuntimeException(e);
	   }
    }
}
