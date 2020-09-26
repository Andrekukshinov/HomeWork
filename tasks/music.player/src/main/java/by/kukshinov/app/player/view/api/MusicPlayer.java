package by.kukshinov.app.player.view.api;

import by.kukshinov.app.player.entity.api.DataStorage;
import by.kukshinov.app.player.entity.music.song.Song;

import java.util.Set;

public interface MusicPlayer {
    void playMusic(DataStorage storage);
    Set<Song> getPlayList(DataStorage storage);
}
