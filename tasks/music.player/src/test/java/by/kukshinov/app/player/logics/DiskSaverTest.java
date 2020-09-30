package by.kukshinov.app.player.logics;

import by.kukshinov.app.player.entity.music.api.Music;
import by.kukshinov.app.player.entity.music.song.Song;
import by.kukshinov.app.player.entity.storage.impl.Disk;
import by.kukshinov.app.player.logics.impl.DiskSaver;
import by.kukshinov.app.player.testData.TestMusicDisk;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class DiskSaverTest {
    @Test
    public void diskSaverShouldSaveMusicToSpecifiedDisk(){
        //given
        Set<Song> threatToSurvival = new HashSet<>();
        Music shinedown = new TestMusicDisk().getMusician(threatToSurvival);
        Disk flash = new Disk();
        SavingSoftware saver = new DiskSaver(flash);
        //when
        saver.saveSongsData(shinedown);
        //then
        Assert.assertEquals(flash.getFakeSongsStorage(), threatToSurvival);
        Assert.assertEquals(flash.getTotalLength(), 239 + 254 + 246);
    }

}
