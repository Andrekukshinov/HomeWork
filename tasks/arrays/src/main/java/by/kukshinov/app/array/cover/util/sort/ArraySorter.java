package by.kukshinov.app.array.cover.util.sort;

import by.kukshinov.app.array.cover.exception.ArrayException;
import by.kukshinov.app.array.cover.wrapper.ArrayWrapper;

public class ArraySorter {
    private void swap(ArrayWrapper arrayToBeSorted, int previous, int current) throws ArrayException {
	   int container = arrayToBeSorted.getElement(previous);
	   arrayToBeSorted.setElement(previous, arrayToBeSorted.getElement(current));
	   arrayToBeSorted.setElement(current, container);
    }

    public void bubbleSortAscending(ArrayWrapper arrayToBeSorted) {
	   int length = arrayToBeSorted.getLength();
	   if (!arrayToBeSorted.isSorted()) {
	       for (int outerRunner = 0; outerRunner < length; ++outerRunner) {
			 for (int runner = 1; runner < length - outerRunner; ++runner) {
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

}
