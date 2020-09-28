package by.kukshinov.app.player.logics.view;

import by.kukshinov.app.player.constants.FilePath;
import by.kukshinov.app.player.entity.music.api.Music;
import by.kukshinov.app.player.entity.music.song.Song;
import by.kukshinov.app.player.entity.storage.impl.Disk;
import by.kukshinov.app.player.logics.SavingSoftware;
import by.kukshinov.app.player.logics.impl.DiskSaver;
import by.kukshinov.app.player.logics.testData.TestMusicDisk;
import by.kukshinov.app.player.view.api.MusicDataPrinter;
import by.kukshinov.app.player.view.impl.FileMusicDataPrinter;
import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;


public class MusicFilePrinterTest {
    private String readFromTestFile() {
	   String s = "";
	   try (BufferedReader reader = new BufferedReader(new FileReader(FilePath.FILE_PATH_FOR_TESTS_OUTPUT))){
		  return s = reader.readLine();
	   } catch (IOException e) {
		  throw new RuntimeException(e);
	   }
    }

    @Test
    public void shouldWriteMusicDataToFile(){
        //given
	   Set<Song> songs = new HashSet<>();
	   Music music = TestMusicDisk.getMusician(songs);
	   Disk flash = new Disk();
	   SavingSoftware saver = new DiskSaver(flash);
	   saver.saveSongsData(music);
	   MusicDataPrinter printer = new FileMusicDataPrinter(FilePath.FILE_PATH_FOR_TESTS_OUTPUT);
	   //when
	   printer.printSongsData(flash);

	   //then
	   String result = readFromTestFile();
	   Assert.assertEquals(result, "The playlist is " +flash.getFakeSongsStorage().toString());
    }
    @Test
    public void shouldWriteMusicLengthToFile(){
        //given
	   Set<Song> songs = new HashSet<>();
	   Music music = TestMusicDisk.getMusician(songs);
	   Disk flash = new Disk();
	   SavingSoftware saver = new DiskSaver(flash);
	   saver.saveSongsData(music);
	   MusicDataPrinter printer = new FileMusicDataPrinter(FilePath.FILE_PATH_FOR_TESTS_OUTPUT);
	   //when
	   printer.printLength(flash);

	   //then
	   String result = readFromTestFile();
	   Assert.assertEquals(result, "Total playlist length is " + flash.getTotalLength());
    }


}
