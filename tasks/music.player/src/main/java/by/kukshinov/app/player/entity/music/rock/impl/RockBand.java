package by.kukshinov.app.player.entity.music.rock.impl;

import by.kukshinov.app.player.entity.music.rock.RockMusic;
import by.kukshinov.app.player.entity.music.song.Song;

import java.util.Objects;
import java.util.Set;

public class RockBand extends RockMusic {

    private final Set<Song> album;
    private final String performer;

    public RockBand(Set<Song> album, String performerName) {
        super(album);
        this.album = album;
        this.performer = performerName;
    }

    @Override
    public Set<Song> getSongs() {
        return album;
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
