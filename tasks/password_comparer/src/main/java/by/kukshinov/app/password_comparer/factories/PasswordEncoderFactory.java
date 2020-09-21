package by.kukshinov.app.password_comparer.factories;

import by.kukshinov.app.password_comparer.factory_enums.Encoders;
import by.kukshinov.app.password_comparer.exceptions.NoSuchPasswordEncoderException;
import by.kukshinov.app.password_comparer.util.PasswordEncoder;
import by.kukshinov.app.password_comparer.util.impl.DumpPasswordEncoder;
import by.kukshinov.app.password_comparer.util.impl.FakePasswordEncoder;

public class PasswordEncoderFactory {
    public static PasswordEncoder createEncoder(Encoders encoder) {
        switch (encoder) {
            case DUMP: return new DumpPasswordEncoder();
            case FAKE: return new FakePasswordEncoder();
            default: throw new NoSuchPasswordEncoderException();
        }
    }
}
