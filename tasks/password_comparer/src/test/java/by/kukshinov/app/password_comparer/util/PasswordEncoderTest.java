package by.kukshinov.app.password_comparer.util;

import by.kukshinov.app.password_comparer.factories.PasswordEncoderFactory;
import org.junit.Assert;
import org.junit.Test;

import static by.kukshinov.app.password_comparer.factory_enums.Encoders.*;

public class PasswordEncoderTest {
    @Test
    public void testDumpPasswordEncoderEncodeMethod() {
        //given
        String password = "pA$$worD";
        //when
        String res = PasswordEncoderFactory.createEncoder(DUMP).encode(password);
        //then
        Assert.assertEquals("282_@235_@206_@206_@289_@281_@284_@238_@", res);
    }
    @Test
    public void testDumpPasswordEncoderDecodeMethod() {
        //given
        String encodedPassword = "282_@235_@206_@206_@289_@281_@284_@238_@";
        //when
        String res = PasswordEncoderFactory.createEncoder(DUMP).decode(encodedPassword);
        //then
        Assert.assertEquals("pA$$worD", res);
    }
}
