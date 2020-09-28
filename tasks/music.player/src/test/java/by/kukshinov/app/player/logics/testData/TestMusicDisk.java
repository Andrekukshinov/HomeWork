package by.kukshinov.app.player.logics.testData;

import by.kukshinov.app.player.entity.music.api.Music;
import by.kukshinov.app.player.entity.music.impl.RockBand;
import by.kukshinov.app.player.entity.music.song.Song;
import by.kukshinov.app.player.entity.storage.impl.Disk;
import by.kukshinov.app.player.logics.SavingSoftware;
import by.kukshinov.app.player.logics.impl.DiskSaver;
import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Set;

public class TestMusicDisk {
    @NotNull
    public static Music getMusician(Set<Song> threatToSurvival) {
	   threatToSurvival.add(new Song("Cut the cord", 239));
	   threatToSurvival.add(new Song("Black cadillac", 254));
	   threatToSurvival.add(new Song("Oblivion", 246));
	   Music shinedown = new RockBand(threatToSurvival, "Shinedown");
	   return shinedown;
    }
}
