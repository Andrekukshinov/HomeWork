package by.kukshinov.app.array.cover.util.parse.impl;


import by.kukshinov.app.array.cover.util.parse.Parser;

import java.util.Arrays;

public class StringToIntParser implements Parser {
    public int[] stringCommaSpaceSplitter(String source) {
	   String[] cont = source.split(", ");
	   int length = cont.length;
	   int[] result = new int[length];
	   for (int runner = 0; runner < length; ++runner) {
		  result[runner] = Integer.parseInt(cont[runner]);
	   }
	   return result;
    }

    @Override
    public int parseOneString(String source) {
	   return Integer.parseInt(source);
    }
}
