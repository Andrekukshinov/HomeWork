package by.kukshinov.app.array.cover.util.fillers;

import by.kukshinov.app.array.cover.exception.ArrayException;
import by.kukshinov.app.array.cover.wrapper.ArrayWrapper;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArrayFillerTest {
    @Test
    public void testArrayFillerShouldCorrectlyFillDefaultArrayWrapper() throws ArrayException {
        //given
	   ArrayFiller filler = new ArrayFiller();
	   ArrayWrapper wrapper = new ArrayWrapper();
	   int[] source = createAscendingArray();
	   ArrayWrapper ethalon = new ArrayWrapper(source);
	   //when
	   filler.fillWrapperArray(source, wrapper);
	   //then
	   Assert.assertTrue(ethalon.equals(wrapper));
    }

    private int[] createAscendingArray() {
	   int[] source = new int[10];
	   for (int runner = 0; runner < source.length; ++runner) {
	       source[runner] = runner;
	   }
	   return source;
    }

}
