package by.kukshinov.app.determine.seconds.logics;

import static by.kukshinov.app.determine.seconds.constnts.TimeConstants.*;

public class ValidateSeconds {
    private boolean validateMinBorder(int seconds) {
       return seconds >= 0;
    }
    private boolean validateMaxBorder(int seconds) {
        return seconds < (SECONDS_IN_HOUR * HOURS_PER_DAY);
    }

    public boolean validateSecond(int second) {
        return validateMinBorder(second) && validateMaxBorder(second);
    }
}
