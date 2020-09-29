package by.kukshinov.app.array.cover.wrapper;

import by.kukshinov.app.array.cover.exception.ArrayException;

public class Array {
    private final int[] innerArray;
    private final int LENGTH;

    private boolean isIndexValid(int index) {
	   return index >= 0 && index < innerArray.length;
    }

    private boolean isZeroFilled(){
	   boolean isZeroed = true;
	   for (int runner = 0; isZeroed && runner < innerArray.length; ++runner) {
		  isZeroed = innerArray[runner++] == 0;
	   }
	   return isZeroed;
    }

    private boolean isAscending(){
	   boolean isSorted = true;
	   int runner = 1;
	   while (isSorted && runner < innerArray.length) {
		  isSorted = innerArray[runner - 1] < innerArray[runner++];
	   }
	   return isSorted;
    }

    private boolean isDescending(){
	   boolean isSorted = true;
	   int runner = 1;
	   while (isSorted && runner < innerArray.length) {
		  isSorted = innerArray[runner - 1] < innerArray[runner++];
	   }
	   return isSorted;
    }

    public Array() {
        LENGTH = 10;
        innerArray = new int[LENGTH];
    }

    public Array(int length) throws ArrayException {
        if(length > 0) {
		  innerArray = new int[length];
		  this.LENGTH = length;
	   } else {
		  throw new ArrayException("Length must be positive!");
	   }
    }

    public Array(int[] innerArray) {
	   this.innerArray = innerArray;
	   this.LENGTH = innerArray.length;
    }

    public int getElement(int index) throws ArrayException {
	   if (isIndexValid(index)) {
		  return innerArray[index];
	   } else {
		  throw new ArrayException("invalid index!");
	   }
    }

    public void setElement(int index, int value) throws ArrayException {
	   if (isIndexValid(index)) {
		  innerArray[index] = value;
	   } else {
		  throw new ArrayException("invalid index!");
	   }
    }

    public boolean isSorted() {
	   return isAscending() || isDescending() || isZeroFilled();
    }

    public int getLength() {
	   return LENGTH;
    }
    // TODO: 29.09.2020 override equals toString hashCode 
}
