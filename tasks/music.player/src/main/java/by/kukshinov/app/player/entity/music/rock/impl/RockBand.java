package by.kukshinov.app.player.entity.music.rock.impl;

import by.kukshinov.app.player.entity.music.rock.RockMusic;
import by.kukshinov.app.player.entity.music.song.Song;

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

}
