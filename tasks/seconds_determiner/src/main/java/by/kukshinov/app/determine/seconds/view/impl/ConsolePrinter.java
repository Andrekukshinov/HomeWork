package by.kukshinov.app.determine.seconds.view.impl;

import by.kukshinov.app.determine.seconds.util.TimePersistence;
import by.kukshinov.app.determine.seconds.view.Printer;

public class ConsolePrinter implements Printer {
    @Override
    public void printData(TimePersistence data) {
        System.out.println(data);
    }
}
