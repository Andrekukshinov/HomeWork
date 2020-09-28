package by.kukshinov.app.player.logics.impl;

import by.kukshinov.app.player.entity.music.api.Music;
import by.kukshinov.app.player.entity.music.impl.RockBand;
import by.kukshinov.app.player.entity.music.song.Song;
import by.kukshinov.app.player.entity.storage.impl.Disk;
import by.kukshinov.app.player.logics.SavingSoftware;
import by.kukshinov.app.player.logics.testData.TestMusicDisk;
import org.jetbrains.annotations.NotNull;
import org.junit.Assert;
import org.junit.Test;

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
