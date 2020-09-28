package by.kukshinov.app.player.data.impl;

import by.kukshinov.app.player.data.api.DataAcquirer;
import by.kukshinov.app.player.entity.storage.api.DataStorage;

public class DiskDataAcquirer implements DataAcquirer {

    @Override
    public String getData(DataStorage storage) {
        return storage.getFakeSongsStorage().toString();
    }
}
