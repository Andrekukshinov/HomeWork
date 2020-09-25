package by.kukshinov.app.player.entity.music.rock;

import by.kukshinov.app.player.entity.api.Music;
import by.kukshinov.app.player.entity.music.song.Song;
import by.kukshinov.app.player.enums.MusicType;

import java.util.Set;

public abstract class RockMusic extends Music {
    private final MusicType TYPE;

    protected RockMusic(Set<Song> album) {
        super(album);
        TYPE = MusicType.ROCK;
    }

    @Override
    public MusicType getType() {
        return TYPE;
    }
}
