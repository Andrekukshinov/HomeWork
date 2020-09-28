package by.kukshinov.app.player.logics.factory;

import by.kukshinov.app.player.constants.FilePath;
import by.kukshinov.app.player.constants.PlayLists;
import by.kukshinov.app.player.entity.music.api.Music;
import by.kukshinov.app.player.entity.music.impl.RockBand;
import by.kukshinov.app.player.enums.PlayListDataSource;
import by.kukshinov.app.player.factory.MusicCreator;
import org.junit.Assert;
import org.junit.Test;

public class MusicCreatorTest {
    @Test
    public void testMusicCreatorShouldReturnQueenPlayList(){
        //given
	   RockBand queen = new RockBand(PlayLists.QUEEN, "queen" );
	   MusicCreator creator = new MusicCreator(PlayListDataSource.FILE, FilePath.FILE_PATH_FOR_TESTS_INPUT);
	   //when
	   Music createdBand = creator.createMusicList();
	   //then
	   Assert.assertEquals(createdBand, queen);
    }
    @Test(expected = RuntimeException.class)//then
    public void testMusicCreatorShouldThrowException(){
        //given
	   RockBand queen = new RockBand(PlayLists.QUEEN, "queen" );
	   MusicCreator creator = new MusicCreator(PlayListDataSource.FILE, FilePath.FILE_PATH_FOR_TESTS_EXCEPTION);
	   Music createdBand = creator.createMusicList();
	   //when
	   Assert.assertEquals(createdBand, queen);

    }
}
