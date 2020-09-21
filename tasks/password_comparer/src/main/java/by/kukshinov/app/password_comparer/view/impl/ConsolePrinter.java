package by.kukshinov.app.password_comparer.view.impl;

import by.kukshinov.app.password_comparer.view.DataPrinter;

public class ConsolePrinter implements DataPrinter {
    public void printData(String data) {
        System.out.println(data);
    }
}
