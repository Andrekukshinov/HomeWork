package by.kukshinov.app.tasks.determine.seconds.logics;


import by.kukshinov.app.determine.seconds.constnts.TimeConstants;
import by.kukshinov.app.determine.seconds.logics.SecondsDeterminer;
import by.kukshinov.app.determine.seconds.logics.ValidateSeconds;
import by.kukshinov.app.determine.seconds.util.TimePersistence;
import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;

import static by.kukshinov.app.determine.seconds.constnts.TimeConstants.*;


public class TestSecondsDeterminer {
    @Test
    public void testTimePassedSinceMidnight() {
        //given
        SecondsDeterminer secondsDeterminer = new SecondsDeterminer();
        int hours = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        int minutes = Calendar.getInstance().get(Calendar.MINUTE);
        int seconds = Calendar.getInstance().get(Calendar.SECOND);
        int totalSeconds = hours * SECONDS_IN_HOUR + minutes * SECONDS_IN_MINUTE + seconds;

        //when
        TimePersistence result = secondsDeterminer.determineCurrentTime(totalSeconds);
        //then
        TimePersistence localPersist = new TimePersistence(hours, minutes, seconds);
        Assert.assertEquals(localPersist, result);
    }
    @Test
    public void testTimeValidator() {
        //given
        int secondsMore24Hours = SECONDS_IN_DAY + 1;

        //when
        boolean isValid = new ValidateSeconds().validateSecond(secondsMore24Hours);
        //then
        Assert.assertFalse(isValid);
    }
}

