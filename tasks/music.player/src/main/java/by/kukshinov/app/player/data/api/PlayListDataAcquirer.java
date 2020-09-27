package by.kukshinov.app.player.data.api;

import by.kukshinov.app.player.entity.api.DataStorage;
import by.kukshinov.app.player.exeptions.NoSuchMusicTypeException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public interface PlayListDataAcquirer {
    String getMusicType(BufferedReader reader);
    String getPerformer(BufferedReader reader, String musicType) throws IOException, NoSuchMusicTypeException;
}
