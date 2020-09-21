package by.kukshinov.app.determine.seconds;


import by.kukshinov.app.determine.seconds.data.DataAccessor;
import by.kukshinov.app.determine.seconds.enums.AccessorEnum;
import by.kukshinov.app.determine.seconds.logics.SecondsDeterminer;
import by.kukshinov.app.determine.seconds.util.AccessorFactory;
import by.kukshinov.app.determine.seconds.util.TimePersistence;
import by.kukshinov.app.determine.seconds.view.Printer;
import by.kukshinov.app.determine.seconds.view.impl.ConsolePrinter;

public class Main {
    public static void main(String[] args) {
        DataAccessor accessor = AccessorFactory.getAccessor(AccessorEnum.RANDOM);
        int consoleData = accessor.getSeconds();

        SecondsDeterminer determiner = new SecondsDeterminer();
        TimePersistence result = determiner.determineCurrentTime(consoleData);

        Printer resolver = new ConsolePrinter();
        resolver.printData(result);
    }

}
