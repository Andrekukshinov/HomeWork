package by.kukshinov.app.array.cover.application;

import by.kukshinov.app.array.cover.constants.FilePaths;
import by.kukshinov.app.array.cover.data.DataAcquirer;
import by.kukshinov.app.array.cover.enums.DataAcquirerType;
import by.kukshinov.app.array.cover.exception.ArrayException;
import by.kukshinov.app.array.cover.factory.DataAcquirerCreator;
import by.kukshinov.app.array.cover.util.fillers.ArrayFiller;
import by.kukshinov.app.array.cover.util.filter.UniqueDigitsFilter;
import by.kukshinov.app.array.cover.util.parse.impl.StringToIntParser;
import by.kukshinov.app.array.cover.util.sort.ArraySorter;
import by.kukshinov.app.array.cover.wrapper.ArrayWrapper;

import javax.swing.*;
import java.util.Arrays;

public class ArrayWrapperApplication {
    public static void main(String[] args) throws ArrayException {
// TODO: 29.09.2020 write tests, add util class for logics, check the rest todos
        // Array wrapper on creation must be ready, and return opy of the whole array fix relative path
        DataAcquirer acquirer = new DataAcquirerCreator().createDataAcquirer(DataAcquirerType.FILE, FilePaths.ARRAY_DATA_FILE_PATH, new StringToIntParser());
        int[] arrayToFill = acquirer.getData();
        ArrayFiller filler = new ArrayFiller();
        UniqueDigitsFilter filter = new UniqueDigitsFilter();
        ArraySorter sorter = new ArraySorter();
        ArrayWrapper wrapper = new ArrayWrapper(arrayToFill.length);
        filler.fillWrapperArray(arrayToFill, wrapper);
        sorter.bubbleSortAscending(wrapper);
        //TODO: 30.09.2020 create printers rework equals toString hashcode
        System.out.println(Arrays.toString(filter.selectNumbersWithUniqueNumbers(wrapper)));
        System.out.println(wrapper);
    }
}
