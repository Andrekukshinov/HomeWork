package by.kukshinov.app.array.cover.data.impl;

import by.kukshinov.app.array.cover.data.DataAcquirer;

import java.util.Random;

public class RandomDataAcquirer implements DataAcquirer {

    private int[] fillArray(Random randomizer, int[] result) {
	   for (int runner = 0; runner < result.length; ++runner) {
		  result[runner] = randomizer.nextInt(1000);
	   }
	   return result;
    }

    @Override
    public int[] getData() {
	   Random randomizer = new Random();
	   int[] result = new int[randomizer.nextInt(50)];
	   return fillArray(randomizer, result);
    }


}
