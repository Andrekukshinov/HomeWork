package by.kukshinov.app.array.cover.util.filter;

	   import by.kukshinov.app.array.cover.exception.ArrayException;
	   import by.kukshinov.app.array.cover.wrapper.ArrayWrapper;

	   import java.util.ArrayList;
	   import java.util.Arrays;
	   import java.util.Collections;
	   import java.util.List;

public class UniqueDigitsFilter {
    private boolean isUnique(int number) {
	   int hundreds = number / 100;
	   int dozens = (number % 100) / 10;
	   int units = (number % 10);
	   return hundreds != dozens && hundreds != units && units != dozens;
    }
    public Integer[] selectNumbersWithUniqueNumbers(ArrayWrapper wrapper) throws ArrayException {
	   List<Integer> numbersWithUniqueNumbers = new ArrayList<>();
	   for (int runner = 0; runner < wrapper.getLength(); ++runner) {
		  int number = wrapper.getElement(runner);
		  if(isUnique(number)) {
		      numbersWithUniqueNumbers.add(number);
		  }
	   }
	   return numbersWithUniqueNumbers.toArray(new Integer[0]);
    }
}
