package by.kukshinov.app.player.logics.impl;

import by.kukshinov.app.player.entity.api.Music;
import by.kukshinov.app.player.entity.music.rock.impl.RockBand;
import by.kukshinov.app.player.entity.music.song.Song;
import by.kukshinov.app.player.entity.storage.Disk;
import by.kukshinov.app.player.logics.SavingSoftware;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class DiskSaverTest {
    @Test
    public void diskSaverShouldSaveMusicToSpecifiedDisk(){
        //given
        Set<Song> threatToSurvival = new HashSet<>();
        threatToSurvival.add(new Song("Cut the cord", 239));
        threatToSurvival.add(new Song("Black cadillac", 254));
        threatToSurvival.add(new Song("Oblivion", 246));
        Music shinedown = new RockBand(threatToSurvival, "Shinedown");
        Disk flash = new Disk();
        SavingSoftware saver = new DiskSaver(flash);
        //when
        saver.saveSongsData(shinedown);
        //then
        Assert.assertEquals(flash.getFakeSongsStorage(), threatToSurvival);
        Assert.assertEquals(flash.getTotalLength(), 239 + 254 + 246);
    }
}
