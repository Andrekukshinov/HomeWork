package by.kukshinov.app.player.application;

import by.kukshinov.app.player.entity.api.DataStorage;
import by.kukshinov.app.player.entity.api.Music;
import by.kukshinov.app.player.entity.storage.Disk;
import by.kukshinov.app.player.factory.MusicCreator;
import by.kukshinov.app.player.logics.SavingSoftware;
import by.kukshinov.app.player.logics.impl.DiskSaver;
import by.kukshinov.app.player.view.api.MusicDataPrinter;
import by.kukshinov.app.player.view.api.MusicPlayer;
import by.kukshinov.app.player.view.impl.DiskMusicDataPrinter;
import by.kukshinov.app.player.view.impl.DiskMusicPlayer;

public class MusicPlayerApplication {
    public static void main(String[] args) {
        Music music = MusicCreator.createMusicList();
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
