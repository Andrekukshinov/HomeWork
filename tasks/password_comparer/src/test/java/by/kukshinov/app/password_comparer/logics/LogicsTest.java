package by.kukshinov.app.password_comparer.logics;

import org.junit.Assert;
import org.junit.Test;

import static by.kukshinov.app.password_comparer.util.paths.FilePaths.TEST_RESOURCE_PASSWORDS;

public class LogicsTest {
    @Test
    public void testUserPasswordEqualsToFilePass() {
        //given
        PasswordComparer comparer = new PasswordComparer();
        String userPassword = "pA$$worD";
        //when
        String result = comparer.comparePasswords(userPassword,TEST_RESOURCE_PASSWORDS);
        //then
        Assert.assertEquals(result, "Success!");
    }
    @Test(expected = IllegalArgumentException.class)//then
    public void testUserPasswordThrowIllegalArgsException() {
        //given
        PasswordComparer comparer = new PasswordComparer();
        String userPassword = "pA$$woqD";
        //when
        String result = comparer.comparePasswords(userPassword,TEST_RESOURCE_PASSWORDS);
    }
}
