package by.kukshinov.app.player.constants;

import by.kukshinov.app.player.entity.music.song.Song;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PlayLists {
    private static final Set<Song> queenPlayList = new HashSet<>();
    private static final Set<Song> shinedownPlayList = new HashSet<>();
    private static final Set<Song> mozartCompositions = new HashSet<>();
    private static final Set<Song> beethovenCompositions = new HashSet<>();
    static {
        queenPlayList.add(new Song("Bohemian rhapsody", 548));
        queenPlayList.add(new Song("We will rock you", 147));
        queenPlayList.add(new Song("Another one bites the dust", 356));
        shinedownPlayList.add(new Song("Cut the cord", 239));
        shinedownPlayList.add(new Song("Black cadillac", 254));
        shinedownPlayList.add(new Song("Oblivion", 246));
        mozartCompositions.add(new Song("Requiem", 435));
        mozartCompositions.add(new Song("Don Juan", 644));
        mozartCompositions.add(new Song("Symphony №25", 525));
        beethovenCompositions.add(new Song("Moonlight sonata", 900));
        beethovenCompositions.add(new Song("Triple Concerto", 2054));
        beethovenCompositions.add(new Song("Choral fantasy", 1055));
    }
    public static final ImmutableSet<Song> QUEEN = ImmutableSet.copyOf(queenPlayList);
    public static final ImmutableSet<Song> SHINEDOWN = ImmutableSet.copyOf(shinedownPlayList);
    public static final ImmutableSet<Song> MOZART = ImmutableSet.copyOf(mozartCompositions);
    public static final ImmutableSet<Song> BEETHOVEN = ImmutableSet.copyOf(beethovenCompositions);
}
