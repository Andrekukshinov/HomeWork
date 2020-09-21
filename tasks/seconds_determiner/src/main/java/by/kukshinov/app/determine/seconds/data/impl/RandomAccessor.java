package by.kukshinov.app.determine.seconds.data.impl;

import by.kukshinov.app.determine.seconds.data.DataAccessor;

import java.util.Random;

import static by.kukshinov.app.determine.seconds.constnts.TimeConstants.SECONDS_IN_DAY;

public class RandomAccessor implements DataAccessor {
    @Override
    public int getSeconds() {
        return new Random().nextInt(SECONDS_IN_DAY);
    }
}
