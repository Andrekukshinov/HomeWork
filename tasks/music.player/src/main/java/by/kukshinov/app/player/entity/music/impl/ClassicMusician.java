package by.kukshinov.app.player.entity.music.impl;

import by.kukshinov.app.player.entity.music.api.Music;
import by.kukshinov.app.player.entity.music.song.Song;
import by.kukshinov.app.player.enums.MusicType;

import java.util.Set;

public class ClassicMusician extends Music {
    private final String composerName;
    private final MusicType type;


    public ClassicMusician(Set<Song> compositions, String composerName) {
        super(compositions);
        this.composerName = composerName;
        type = MusicType.CLASSIC;
    }

    @Override
    public MusicType getType() {
        return type;
    }

    @Override
    public String getPerformer() {
        return composerName;
    }
}
