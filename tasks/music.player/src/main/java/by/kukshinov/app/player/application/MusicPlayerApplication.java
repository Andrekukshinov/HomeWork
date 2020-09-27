package by.kukshinov.app.player.application;

import by.kukshinov.app.player.constants.FilePath;
import by.kukshinov.app.player.constants.PlayLists;
import by.kukshinov.app.player.data.impl.ConsolePlayListDataAcquirer;
import by.kukshinov.app.player.data.impl.FilePlayListDataAcquirer;
import by.kukshinov.app.player.entity.api.DataStorage;
import by.kukshinov.app.player.entity.api.Music;
import by.kukshinov.app.player.entity.storage.Disk;
import by.kukshinov.app.player.enums.PlayListDataSource;
import by.kukshinov.app.player.factory.MusicCreator;
import by.kukshinov.app.player.logics.SavingSoftware;
import by.kukshinov.app.player.logics.impl.DiskSaver;
import by.kukshinov.app.player.view.api.MusicDataPrinter;
import by.kukshinov.app.player.view.api.MusicPlayer;
import by.kukshinov.app.player.view.impl.DiskMusicDataPrinter;
import by.kukshinov.app.player.view.impl.DiskMusicPlayer;

import java.io.*;

import static by.kukshinov.app.player.constants.FilePath.*;
import static by.kukshinov.app.player.enums.PlayListDataSource.*;

public class MusicPlayerApplication {
    public static void main(String[] args) {
        Music music = new MusicCreator(FILE, FILE_PATH).createMusicList();
        DataStorage flashCard = new Disk();
        SavingSoftware soft = new DiskSaver(flashCard);
        soft.saveSongsData(music);
        MusicPlayer player = new DiskMusicPlayer();
        player.playMusic(flashCard);
        MusicDataPrinter dataPrinter = new DiskMusicDataPrinter();
        dataPrinter.getLength(flashCard);
        dataPrinter.getSongsData(flashCard);
    }
}

