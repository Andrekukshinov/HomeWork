package by.kukshinov.app.player.factory;

import by.kukshinov.app.player.entity.api.Music;
import by.kukshinov.app.player.entity.music.classic.impl.Composer;
import by.kukshinov.app.player.entity.music.rock.impl.RockBand;
import by.kukshinov.app.player.entity.music.song.Song;
import by.kukshinov.app.player.enums.MusicType;
import by.kukshinov.app.player.enums.SingerName;
import by.kukshinov.app.player.exeptions.NoMusicianException;
import by.kukshinov.app.player.exeptions.NoSuchMusicTypeException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MusicCreator {
    private static Set<Song> chooseAlbum(SingerName name) throws NoMusicianException {
        Set<Song> playList = new HashSet<>();
        switch (name) {
            case QUEEN: {
                playList.add(new Song("Bohemian rhapsody", 548));
                playList.add(new Song("We will rock you", 147));
                playList.add(new Song("Another one bites the dust", 356));
            }
            ;
            break;
            case SHINEDOWN: {
                playList.add(new Song("Cut the cord", 239));
                playList.add(new Song("Black cadillac", 254));
                playList.add(new Song("Oblivion", 246));
            }
            ;
            break;
            case MOZART: {
                playList.add(new Song("Requiem", 435));
                playList.add(new Song("Don Juan", 644));
                playList.add(new Song("Symphony №25", 525));
            }
            ;
            break;
            case BEETHOVEN: {
                playList.add(new Song("Moonlight sonata", 900));
                playList.add(new Song("Triple Concerto", 2054));
                playList.add(new Song("Choral fantasy", 1055));
            }
            ;
            break;
            default:
                throw new NoMusicianException("This artist is not available");
        }
        return playList;
    }

    private static Music getType(MusicType type, BufferedReader reader) throws IOException, NoSuchMusicTypeException {
        String artistName;
        Set<Song> songs;
        Music playList;
        switch (type) {
            case ROCK: {
                System.out.println("Choose rock band name:(Queen)/(Shinedown)");
                artistName = reader.readLine();
                try {
                    songs = chooseAlbum(SingerName.valueOf(artistName.toUpperCase()));
                    playList = new RockBand(songs, artistName);
                } catch (NoMusicianException e) {
                    throw new RuntimeException(e);
                }
            }
            break;
            case CLASSIC: {
                System.out.println("Choose rock band name:(Mozart)/(Beethoven)");
                artistName = reader.readLine();
                try {
                    songs = chooseAlbum(SingerName.valueOf(artistName.toUpperCase()));
                    playList = new Composer(songs, artistName);
                } catch (NoMusicianException e) {
                    throw new RuntimeException(e);
                }
            }
            break;
            default:
                throw new NoSuchMusicTypeException("Such music type is not available");
        }
        return playList;
    }

    // TODO: 25.09.2020
    public static Music createMusicList() {
        Music result = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            boolean goOn = true;
            result = getMusic(reader);
            System.out.println("Would you like adding some more music?(y/n)");
            String answer = reader.readLine();
            if (goOn = answer.equalsIgnoreCase("y")) {
                addAdditionalMusic(result, reader, goOn);
            }
        } catch (IOException | NoSuchMusicTypeException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
        return result;
    }

    private static void addAdditionalMusic(Music result, BufferedReader reader, boolean goOn) throws IOException, NoSuchMusicTypeException {
        do {
            Music musicToAdd = getMusic(reader);
            result.addSongs(musicToAdd.getSongs());
            System.out.println("Would you like adding some more music?(y/n)");
            String answer = reader.readLine();
            goOn = answer.equals("y");
        } while (goOn);
    }

    private static Music getMusic(BufferedReader reader) throws IOException, NoSuchMusicTypeException {
        Music result;
        System.out.println("Choose and input music type:(Rock)/(Classic)");
        // read music type
        String musicType = reader.readLine();
        MusicType type = MusicType.valueOf(musicType.toUpperCase());
        result = getType(type, reader);
        return result;
    }

}
