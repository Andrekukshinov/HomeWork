package by.kukshinov.app.player.logics.impl;

import by.kukshinov.app.player.entity.api.DataStorage;
import by.kukshinov.app.player.entity.api.Music;
import by.kukshinov.app.player.entity.music.song.Song;
import by.kukshinov.app.player.enums.MusicType;
import by.kukshinov.app.player.logics.SavingSoftware;

import java.util.Set;

public class DiskSaver implements SavingSoftware {
    private DataStorage disk;

    private void addSongToTotalLength(DataStorage disk, Song song) {
        disk.increaseTotalLength( song.getLength());
    }
    private void saveSongs(Set<Song> songs, String performer, MusicType type, DataStorage disk) {
        disk.getFakeSongsDataStorage()
                .append(type)
                    .append(": \n\t").append("\"").append(performer).append("\"").append("\t");
        for (Song song : songs) {
            disk.getFakeSongsStorage().add(song);
            disk.getFakeSongsDataStorage().append(song).append(", ");
            addSongToTotalLength(disk, song);
        }
        disk.getFakeSongsDataStorage().append("\n");
    }


    public DiskSaver(DataStorage disk) {
        this.disk = disk;
    }

    @Override
    public void saveSongsData(Music music) {
        saveSongs(music.getSongs(), music.getPerformer(), music.getType(), disk);
    }
}

