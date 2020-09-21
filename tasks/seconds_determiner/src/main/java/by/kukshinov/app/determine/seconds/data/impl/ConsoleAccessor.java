package by.kukshinov.app.determine.seconds.data.impl;


import by.kukshinov.app.determine.seconds.data.DataAccessor;
import by.kukshinov.app.determine.seconds.logics.ValidateSeconds;

import java.util.Scanner;

public class ConsoleAccessor implements DataAccessor {

    private final ValidateSeconds validator;

    public ConsoleAccessor(ValidateSeconds validator) {
        this.validator = validator;
    }

    public int getSeconds() {
        int seconds;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Set amount of seconds");
            seconds = scanner.nextInt();
            if (validator.validateSecond(seconds)) {
                return seconds;
            }
        }
        throw new RuntimeException("Seconds should be positive and less than 84 600 ");
    }
}
