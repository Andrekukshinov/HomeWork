package by.kukshinov.app.player.exeptions;

public class NoSuchMusicTypeException extends Exception {
    public NoSuchMusicTypeException(String massage) {
        super(massage);
    }
}
