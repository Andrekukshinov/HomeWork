package by.kukshinov.app.player.data.api;

import by.kukshinov.app.player.entity.storage.api.DataStorage;

public interface DataAcquirer {
    String getData(DataStorage storage);
}
