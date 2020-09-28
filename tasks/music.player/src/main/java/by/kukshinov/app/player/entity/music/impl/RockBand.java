package by.kukshinov.app.player.entity.music.impl;

import by.kukshinov.app.player.entity.music.api.Music;
import by.kukshinov.app.player.entity.music.song.Song;
import by.kukshinov.app.player.enums.MusicType;

import java.util.Objects;
import java.util.Set;

public class RockBand extends Music {

    private final Set<Song> album;
    private final String performer;
    private final MusicType type;

    public RockBand(Set<Song> album, String performerName) {
        super(album);
        this.album = album;
        this.performer = performerName;
        type = MusicType.ROCK;
    }

    @Override
    public Set<Song> getSongs() {
        return album;
    }

    @Override
    public MusicType getType() {
        return type;
    }

    public String getPerformer() {
        return performer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        RockBand band = (RockBand) o;
        return Objects.equals(album, band.album) && Objects.equals(getPerformer(), band.getPerformer());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), album, getPerformer());
    }
}
