package by.kukshinov.app.player.entity.storage;

import by.kukshinov.app.player.entity.api.DataStorage;
import by.kukshinov.app.player.entity.music.song.Song;

import java.util.HashSet;
import java.util.Set;

public class Disk implements DataStorage {
    private final StringBuilder fakeSongsDataStorage;
    private int totalLength;
    private final Set<Song> fakeSongsStorage;

    public Disk() {
        fakeSongsDataStorage = new StringBuilder();
        totalLength = 0;
        fakeSongsStorage = new HashSet<>();
    }


    public int getTotalLength() {
        return totalLength;
    }

    public StringBuilder getFakeSongsDataStorage() {
        return fakeSongsDataStorage;
    }

    @Override
    public Set<Song> getFakeSongsStorage() {
        return fakeSongsStorage;
    }

    @Override
    public void increaseTotalLength(int songLength) {
        totalLength += songLength;
    }
}
