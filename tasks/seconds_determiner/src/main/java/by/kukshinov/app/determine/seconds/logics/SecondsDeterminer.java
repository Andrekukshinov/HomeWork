package by.kukshinov.app.determine.seconds.logics;

import by.kukshinov.app.determine.seconds.util.TimePersistence;

import static by.kukshinov.app.determine.seconds.constnts.TimeConstants.*;

public class SecondsDeterminer {
    public TimePersistence determineCurrentTime(int currentSeconds) {
        int hours = currentSeconds / SECONDS_IN_HOUR;
        int minutes = (currentSeconds - hours * SECONDS_IN_HOUR) / SECONDS_IN_MINUTE;
        int seconds = currentSeconds - (minutes * SECONDS_IN_MINUTE + hours * SECONDS_IN_HOUR);
        return new TimePersistence(hours, minutes, seconds);
    }
}
