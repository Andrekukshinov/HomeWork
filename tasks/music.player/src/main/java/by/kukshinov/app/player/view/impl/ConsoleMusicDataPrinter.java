package by.kukshinov.app.player.view.impl;

import by.kukshinov.app.player.entity.storage.api.DataStorage;
import by.kukshinov.app.player.view.api.MusicDataPrinter;

public class ConsoleMusicDataPrinter implements MusicDataPrinter {

    @Override
    public void printLength(DataStorage disk) {
        System.out.println("Total music length is " + disk.getTotalLength());
    }

    @Override
    public void printSongsData(DataStorage disk) {
        System.out.println("Songs: " + disk.getFakeSongsDataStorage());
    }

}
