package by.kukshinov.app.determine.seconds.util;

import java.util.Objects;

public class TimePersistence {
    private int hours;
    private int minutes;
    private int seconds;

    public TimePersistence(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        return "Time{" + "hours=" + hours + ", minutes=" + minutes + ", seconds=" + seconds + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TimePersistence that = (TimePersistence) o;
        return getHours() == that.getHours() && getMinutes() == that.getMinutes() && getSeconds() == that.getSeconds();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHours(), getMinutes(), getSeconds());
    }
}
