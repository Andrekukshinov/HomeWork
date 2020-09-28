package by.kukshinov.app.player.view.api;

import by.kukshinov.app.player.entity.storage.api.DataStorage;

public interface MusicDataPrinter {
    void printLength(DataStorage disk);
    void printSongsData(DataStorage disk);
}
