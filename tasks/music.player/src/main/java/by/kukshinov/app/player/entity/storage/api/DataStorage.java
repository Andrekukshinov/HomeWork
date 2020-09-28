package by.kukshinov.app.player.entity.storage.api;

import by.kukshinov.app.player.entity.music.song.Song;

import java.util.Set;

public interface DataStorage {
    StringBuilder getFakeSongsDataStorage();
    Set<Song> getFakeSongsStorage();
    void increaseTotalLength(int songLength);
    int getTotalLength();
}
