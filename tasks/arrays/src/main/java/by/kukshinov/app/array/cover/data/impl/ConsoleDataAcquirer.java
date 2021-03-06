package by.kukshinov.app.array.cover.data.impl;

import by.kukshinov.app.array.cover.data.DataAcquirer;
import by.kukshinov.app.array.cover.util.parse.Parser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleDataAcquirer implements DataAcquirer {
    private final Parser parser;

    public ConsoleDataAcquirer(Parser parser) {
	   this.parser = parser;
    }

    private int getLength(BufferedReader reader) throws IOException {
	   System.out.println("Set array length");
	   return parser.parseOneString(reader.readLine());
    }

    private int getValue(BufferedReader reader) throws IOException {
	   System.out.println("Set value");
	   return parser.parseOneString(reader.readLine());
    }

    private int[] filledArray() {
	   int[] result;
	   int length;
	   try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
		  length = getLength(reader);
		  result = new int[length];
		  for (int runner = 0; runner < length; ++runner) {
			 result[runner] = getValue(reader);
		  }
		  return result;
	   } catch (IOException e) {
		  throw new RuntimeException(e);
	   }
    }



    @Override
    public int[] getData() {
	   return filledArray();
    }

}
