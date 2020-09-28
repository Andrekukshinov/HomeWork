package by.kukshinov.app.player.testData;

import by.kukshinov.app.player.entity.music.api.Music;
import by.kukshinov.app.player.entity.music.impl.RockBand;
import by.kukshinov.app.player.entity.music.song.Song;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class TestMusicDisk {
    @NotNull
    public Music getMusician(Set<Song> threatToSurvival) {
	   threatToSurvival.add(new Song("Cut the cord", 239));
	   threatToSurvival.add(new Song("Black cadillac", 254));
	   threatToSurvival.add(new Song("Oblivion", 246));
	   Music shinedown = new RockBand(threatToSurvival, "Shinedown");
	   return shinedown;
    }
}
