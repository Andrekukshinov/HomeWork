package by.kukshinov.app.array.cover.util.fillers;

import by.kukshinov.app.array.cover.exception.ArrayException;
import by.kukshinov.app.array.cover.wrapper.ArrayWrapper;

public class ArrayFiller {
    public void fillWrapperArray(int[] arrayToInsert, ArrayWrapper destination) throws ArrayException {
        if (arrayToInsert.length != destination.getLength()){
            throw new ArrayException("Array length doesn't fit Array Wrapper length");
	   }
        for (int runner = 0; runner < destination.getLength(); ++runner) {
            destination.setElement(runner, arrayToInsert[runner]);
        }
    }
}
