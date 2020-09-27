package by.kukshinov.app.player.data.impl;

import by.kukshinov.app.player.data.api.PlayListDataAcquirer;
import by.kukshinov.app.player.exeptions.NoSuchMusicTypeException;

import java.io.*;

public class FilePlayListDataAcquirer implements PlayListDataAcquirer {

    @Override
    public String getMusicType(BufferedReader reader) {
        try  {
            return reader.readLine();
        } catch (IOException e) {
           throw new RuntimeException(e);
        }
    }

    @Override
    public String getPerformer(BufferedReader reader, String musicType) throws IOException, NoSuchMusicTypeException {
        try  {
            return reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
