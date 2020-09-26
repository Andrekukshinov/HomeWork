package by.kukshinov.app.player.view.impl;

import by.kukshinov.app.player.entity.api.DataStorage;
import by.kukshinov.app.player.entity.storage.Disk;
import by.kukshinov.app.player.view.api.MusicDataPrinter;

public class DiskMusicDataPrinter implements MusicDataPrinter {
    @Override
    public void getLength(DataStorage disk) {
        System.out.println("Total music length on disk is " + disk.getTotalLength());
    }

    @Override
    public void getSongsData(DataStorage disk) {
        System.out.println(disk.getFakeSongsStorage());
    }
}
