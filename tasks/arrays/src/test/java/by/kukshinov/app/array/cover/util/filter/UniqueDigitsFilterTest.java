package by.kukshinov.app.array.cover.util.filter;

import by.kukshinov.app.array.cover.exception.ArrayException;
import by.kukshinov.app.array.cover.wrapper.ArrayWrapper;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class UniqueDigitsFilterTest {
    @Test
    public void testShouldFilterUniqueDigitsInNumber() throws ArrayException {
        //given
	   int[] startArray = {101, 105, 999, 590, 950, 654, 456, 456, 9000, 1};
	   UniqueDigitsFilter filter = new UniqueDigitsFilter();
	   ArrayWrapper wrapper = new ArrayWrapper(startArray);
	   Integer[] comparedArray = {105, 590, 950, 654, 456, 456};
	   //when
	   Integer[] result = filter.selectNumbersWithUniqueNumbers(wrapper);
	   //then
	   Assert.assertTrue(Arrays.deepEquals(comparedArray, result));
    }
}
