package by.kukshinov.app.player.view.impl;

import by.kukshinov.app.player.entity.api.DataStorage;
import by.kukshinov.app.player.entity.music.song.Song;
import by.kukshinov.app.player.view.api.MusicPlayer;

import java.util.Set;

public class DiskMusicPlayer implements MusicPlayer {

    @Override
    public void playMusic(DataStorage storage) {
        System.out.println(storage.getFakeSongsDataStorage().toString());
    }

    @Override
    public Set<Song> getPlayList(DataStorage storage) {
        return storage.getFakeSongsStorage();
    }
}
