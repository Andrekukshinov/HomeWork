package by.kukshinov.app.array.cover.wrapper;

import by.kukshinov.app.array.cover.exception.ArrayException;

import java.util.Arrays;

public class ArrayWrapper {
    private final int[] innerArray;

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

    public ArrayWrapper() {
        innerArray = new int[10];
    }

    public ArrayWrapper(int length) throws ArrayException {
        if(length > 0) {
		  innerArray = new int[length];
	   } else {
		  throw new ArrayException("Length must be positive!");
	   }
    }

    public ArrayWrapper(int[] innerArray) {
	   this.innerArray = innerArray;
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
	   return innerArray.length;
    }
    // TODO: 29.09.2020 override equals toString hashCode

    @Override
    public boolean equals(Object o) {
//	   if (this == o) return true;
	   if (o == null || getClass() != o.getClass()) return false;
	   ArrayWrapper wrapper = (ArrayWrapper) o;
	   return Arrays.equals(innerArray, wrapper.innerArray);
    }

    @Override
    public String toString() {
	   return Arrays.toString(innerArray);
    }
    //    @Override
//    public int hashCode() {
//	   return Arrays.hashCode(innerArray);
//    }
}
