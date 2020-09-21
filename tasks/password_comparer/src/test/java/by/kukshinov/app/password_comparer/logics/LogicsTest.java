package by.kukshinov.app.password_comparer.logics;

import by.kukshinov.app.password_comparer.factories.PasswordEncoderFactory;
import by.kukshinov.app.password_comparer.factory_enums.Encoders;
import by.kukshinov.app.password_comparer.util.paths.FilePaths;
import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static by.kukshinov.app.password_comparer.factories.PasswordEncoderFactory.*;
import static by.kukshinov.app.password_comparer.factory_enums.Encoders.*;
import static by.kukshinov.app.password_comparer.util.paths.FilePaths.TEST_RESOURCE_PASSWORDS;

public class LogicsTest {
    @Test
    public void testUserPasswordEqualsToFilePass() {
        //given
        PasswordComparer comparer = new PasswordComparer(createEncoder(DUMP));
        String userPassword = "pA$$worD";
        //when
        String result = comparer.comparePasswords(userPassword,TEST_RESOURCE_PASSWORDS);
        //then
        Assert.assertEquals(result, "Success!");
    }
    @Test(expected = IllegalArgumentException.class)//then
    public void testUserPasswordThrowIllegalArgsException() {
        //given
        PasswordComparer comparer = new PasswordComparer(createEncoder(DUMP));
        String userPassword = "pA$$woqD";
        //when
        String result = comparer.comparePasswords(userPassword,TEST_RESOURCE_PASSWORDS);
    }
}
