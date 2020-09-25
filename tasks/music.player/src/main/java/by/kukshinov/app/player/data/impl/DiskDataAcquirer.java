package by.kukshinov.app.player.data.impl;

import by.kukshinov.app.player.data.DataAcquirer;
import by.kukshinov.app.player.entity.api.DataStorage;

public class DiskDataAcquirer implements DataAcquirer {

    @Override
    public String getData(DataStorage storage) {
        return storage.getFakeSongsStorage().toString();
    }
}
