package by.kukshinov.app.player.entity.music.classic;

import by.kukshinov.app.player.entity.api.Music;
import by.kukshinov.app.player.entity.music.song.Song;
import by.kukshinov.app.player.enums.MusicType;

import java.util.Set;

public abstract class ClassicMusic extends Music {
    private final MusicType TYPE;

    protected ClassicMusic(Set<Song> album) {
        super(album);
        TYPE = MusicType.CLASSIC;
    }

    public MusicType getType() {
        return TYPE;
    }
}
