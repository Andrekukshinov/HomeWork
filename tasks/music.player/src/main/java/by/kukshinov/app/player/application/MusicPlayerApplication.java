package by.kukshinov.app.player.application;

import by.kukshinov.app.player.entity.storage.api.DataStorage;
import by.kukshinov.app.player.entity.music.api.Music;
import by.kukshinov.app.player.entity.storage.impl.Disk;
import by.kukshinov.app.player.enums.PlayListDataSource;
import by.kukshinov.app.player.enums.PrinterType;
import by.kukshinov.app.player.factory.DataOutputCreatorFactory;
import by.kukshinov.app.player.factory.MusicCreator;
import by.kukshinov.app.player.logics.SavingSoftware;
import by.kukshinov.app.player.logics.impl.DiskSaver;
import by.kukshinov.app.player.view.api.MusicDataPrinter;

import static by.kukshinov.app.player.constants.FilePath.*;

public class MusicPlayerApplication {
    public static void main(String[] args) {
        Music music = new MusicCreator(PlayListDataSource.FILE, FILE_INPUT_PATH).createMusicList();
        DataStorage flashCard = new Disk();
        SavingSoftware soft = new DiskSaver(flashCard);
        soft.saveSongsData(music);
        MusicDataPrinter player = new DataOutputCreatorFactory().createDataPrinter(PrinterType.FILE, FILE_OUTPUT_PATH);
        player.printSongsData(flashCard);
    }
}

