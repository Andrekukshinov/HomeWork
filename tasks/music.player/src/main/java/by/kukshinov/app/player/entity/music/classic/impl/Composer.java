package by.kukshinov.app.player.entity.music.classic.impl;

import by.kukshinov.app.player.entity.music.classic.ClassicMusic;
import by.kukshinov.app.player.entity.music.song.Song;

import java.util.Set;

public class Composer extends ClassicMusic {
    private final String composerName;

    public Composer(Set<Song> compositions, String composerName) {
        super(compositions);
        this.composerName = composerName;
    }

    @Override
    public String getPerformer() {
        return composerName;
    }
}
