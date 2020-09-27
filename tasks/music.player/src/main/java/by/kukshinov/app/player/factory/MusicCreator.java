package by.kukshinov.app.player.factory;

import by.kukshinov.app.player.constants.PlayLists;
import by.kukshinov.app.player.data.api.PlayListDataAcquirer;
import by.kukshinov.app.player.data.impl.ConsolePlayListDataAcquirer;
import by.kukshinov.app.player.data.impl.FilePlayListDataAcquirer;
import by.kukshinov.app.player.entity.api.Music;
import by.kukshinov.app.player.entity.music.classic.impl.Composer;
import by.kukshinov.app.player.entity.music.rock.impl.RockBand;
import by.kukshinov.app.player.entity.music.song.Song;
import by.kukshinov.app.player.enums.PlayListDataSource;
import by.kukshinov.app.player.enums.SingerName;
import by.kukshinov.app.player.exeptions.NoMusicianException;
import by.kukshinov.app.player.exeptions.NoSuchDataCreatorException;
import by.kukshinov.app.player.exeptions.NoSuchMusicTypeException;
import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class MusicCreator {
    private final PlayListDataAcquirer playListAcquirer;
    private final String FILE_PATH;
    private final PlayListDataSource DATA_SOURCE;


    public MusicCreator(PlayListDataSource dataSource, String path) {
	   switch (dataSource) {
		  case FILE: {
			 this.playListAcquirer = new FilePlayListDataAcquirer();
			 this.FILE_PATH = path;
			 DATA_SOURCE = dataSource;
		  }
		  break;
		  case CONSOLE: {
			 this.playListAcquirer = new ConsolePlayListDataAcquirer();
			 this.FILE_PATH = path;
			 DATA_SOURCE = dataSource;
		  }
		  break;
		  default: throw new RuntimeException(new NoSuchDataCreatorException());
	   }
    }

    private Set<Song> chooseAlbum(SingerName name) throws NoMusicianException {
	   Set<Song> playList = new HashSet<>();
	   switch (name) {
		  case QUEEN: {
			 playList = PlayLists.QUEEN;
		  }
		  break;
		  case SHINEDOWN: {
		      playList = PlayLists.SHINEDOWN;
		  }
		  break;
		  case MOZART: {
		      playList = PlayLists.MOZART;
		  }
		  break;
		  case BEETHOVEN: {
		      playList = PlayLists.BEETHOVEN;
		  }
		  break;
		  default:
			 throw new NoMusicianException("This artist is not available");
	   }
	   return playList;
    }

    private Music getType(BufferedReader reader) throws IOException, NoSuchMusicTypeException {
	   String musicType = playListAcquirer.getMusicType(reader);
	   String artistName = playListAcquirer.getPerformer(reader, musicType);
	   return getPerformer(artistName, musicType);
    }

    @NotNull
    private Music getPerformer(String artistName, String musicType) throws NoSuchMusicTypeException {
	   Set<Song> songs;
	   Music playList;
	   if (musicType.equalsIgnoreCase("ROCK")) {
		  try {
			 songs = chooseAlbum(SingerName.valueOf(artistName.toUpperCase()));
			 playList = new RockBand(songs, artistName);
		  } catch (NoMusicianException e) {
			 throw new RuntimeException(e);
		  }
	   } else if (musicType.equalsIgnoreCase("CLASSIC")) {
		  try {
			 songs = chooseAlbum(SingerName.valueOf(artistName.toUpperCase()));
			 playList = new Composer(songs, artistName);
		  } catch (NoMusicianException e) {
			 throw new RuntimeException(e);
		  }
	   } else {
		  throw new NoSuchMusicTypeException("Such music type is not available");
	   }

	   return playList;
    }
    @NotNull
    private Music getResultMusic(BufferedReader reader) throws IOException, NoSuchMusicTypeException {
	   Music result;
	   boolean goOn = true;
	   result = getType(reader);
	   addMoreSongs(result, reader, goOn);
	   return result;
    }

    private void addMoreSongs(Music result, BufferedReader reader, boolean goOn) throws IOException, NoSuchMusicTypeException {
	   do {
		  System.out.println("would ypu like adding some more music?(y/n)");
		  if (reader.readLine().equalsIgnoreCase("y")) {
			 result.addSongs(getType(reader).getSongs());
		  } else {
			 goOn = false;
		  }
	   } while (goOn);
    }


    // TODO: 25.09.2020
    public Music createMusicList() {
	   Music result = null;
	   switch (DATA_SOURCE) {
		  case CONSOLE: {
			 try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
				result = getResultMusic(reader);
			 } catch (IOException | NoSuchMusicTypeException e) {
				throw new RuntimeException(e.getMessage(), e);
			 }
		  }
		  break;
		  case FILE: {
			 try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
				result = getType(reader);
			 } catch (IOException | NoSuchMusicTypeException e) {
				e.printStackTrace();
			 }
		  }
		  break;
		  default:
			 try {
				throw new NoSuchDataCreatorException();
			 } catch (NoSuchDataCreatorException e) {
				throw new RuntimeException(e);
			 }
	   }
	   return result;
    }
}
