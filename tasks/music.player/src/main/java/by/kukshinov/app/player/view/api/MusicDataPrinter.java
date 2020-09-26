package by.kukshinov.app.player.view.api;

import by.kukshinov.app.player.entity.api.DataStorage;
import by.kukshinov.app.player.entity.storage.Disk;

public interface MusicDataPrinter {
    void getLength(DataStorage disk);
    void getSongsData(DataStorage disk);
}
