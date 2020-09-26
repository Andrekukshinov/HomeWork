package by.kukshinov.app.player.entity.api;

import by.kukshinov.app.player.entity.music.song.Song;
import by.kukshinov.app.player.enums.MusicType;

import java.util.Set;

public abstract class Music {
    private Set<Song> album;
    protected Music(Set<Song> album) {
        this.album = album;
    }

    public void addSongs(Set<Song> songsToAdd){
        album.addAll(songsToAdd);
    }
    public Set<Song> getSongs() {
        return album;
    }
    public abstract MusicType getType();
    public abstract String getPerformer();
}
