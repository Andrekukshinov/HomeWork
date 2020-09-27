package by.kukshinov.app.player.data.impl;

import by.kukshinov.app.player.data.api.PlayListDataAcquirer;
import by.kukshinov.app.player.entity.api.Music;
import by.kukshinov.app.player.enums.MusicType;
import by.kukshinov.app.player.exeptions.NoSuchMusicTypeException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsolePlayListDataAcquirer implements PlayListDataAcquirer {


    public String getPerformer( BufferedReader reader, String type) throws IOException, NoSuchMusicTypeException {
        if ("ROCK".equalsIgnoreCase(type)) {
		  System.out.println("Choose rock band name:(Queen)/(Shinedown)");
            return reader.readLine().toLowerCase();
	   } else if ("CLASSIC".equalsIgnoreCase(type)) {
		  System.out.println("Choose rock band name:(Mozart)/(Beethoven)");
		  return reader.readLine().toLowerCase();
	   } else {
		  throw new NoSuchMusicTypeException("Such music type is not available");
	   }
    }

    @Override
    public String getMusicType(BufferedReader reader) {
	   StringBuilder result = new StringBuilder("");
	   try {
		  boolean goOn = true;
		  System.out.println("Choose and input music type:(Rock)/(Classic)");
		  String musicType = reader.readLine();
            result.append(musicType);
	   } catch (IOException e) {
		  throw new RuntimeException(e);
	   }
	   return result.toString();
    }
}
