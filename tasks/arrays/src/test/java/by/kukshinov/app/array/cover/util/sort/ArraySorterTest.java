package by.kukshinov.app.array.cover.util.sort;

import by.kukshinov.app.array.cover.wrapper.ArrayWrapper;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArraySorterTest {
    @Test
    public void testShouldSortArrayAscending() {
        //given
	   ArraySorter sorter = new ArraySorter();
	   int[] startArray = {500, 0, -100, 967, 2183, 899, 898, 2832, -100, 5674, 0};
	   int[] sortedArray = {-100, -100, 0, 0, 500, 898, 899, 967, 2183, 2832, 5674};
	   ArrayWrapper wrapper = new ArrayWrapper(startArray);
	   ArrayWrapper toBeCompared = new ArrayWrapper(sortedArray);
	   //when
	   sorter.bubbleSortAscending(wrapper);
	   //then
	   Assert.assertEquals(toBeCompared, wrapper);
    }
}
