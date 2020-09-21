package by.kukshinov.app.determine.seconds.util;

import by.kukshinov.app.determine.seconds.data.DataAccessor;
import by.kukshinov.app.determine.seconds.data.impl.ConsoleAccessor;
import by.kukshinov.app.determine.seconds.data.impl.RandomAccessor;
import by.kukshinov.app.determine.seconds.enums.AccessorEnum;
import by.kukshinov.app.determine.seconds.logics.ValidateSeconds;

public class AccessorFactory {
    public static DataAccessor getAccessor(AccessorEnum accessor) throws RuntimeException {
        switch (accessor) {
            case RANDOM: return new RandomAccessor();
            case CONSOLE: return new ConsoleAccessor(new ValidateSeconds());
            default:throw new RuntimeException("such accessor is not available");
        }
    }
}
