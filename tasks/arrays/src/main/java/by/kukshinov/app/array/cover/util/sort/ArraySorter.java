package by.kukshinov.app.array.cover.util.sort;

import by.kukshinov.app.array.cover.exception.ArrayException;
import by.kukshinov.app.array.cover.wrapper.Array;

public class ArraySorter {
    private void swap(Array arrayToBeSorted, int previous, int current) throws ArrayException {
	   int container = arrayToBeSorted.getElement(previous);
	   arrayToBeSorted.setElement(previous, arrayToBeSorted.getElement(current));
	   arrayToBeSorted.setElement(current, container);
    }

    public void bubbleSort(Array arrayToBeSorted) {
	   int length = arrayToBeSorted.getLength();
	   if (!arrayToBeSorted.isSorted()) {
		  for (int runner = 1; runner < length; ++runner) {
			 try {
				int prevIndex = runner - 1;
				if (arrayToBeSorted.getElement(prevIndex) > arrayToBeSorted.getElement(runner)) {
				    swap(arrayToBeSorted, prevIndex, runner);
				}
			 } catch (ArrayException ignored) {
				//ingnored because runner can never reach array length
			 }
		  }
	   }
    }

}
