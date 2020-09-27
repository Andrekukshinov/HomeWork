package by.kukshinov.app.player.entity.api;

import by.kukshinov.app.player.entity.music.song.Song;
import by.kukshinov.app.player.enums.MusicType;

import java.util.Objects;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Music music = (Music) o;
        return Objects.equals(album, music.album);
    }

    @Override
    public int hashCode() {
        return Objects.hash(album);
    }
}
