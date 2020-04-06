package testgame;

import static org.junit.Assert.*;
import org.junit.Test;


public class RiddleNumTest {

    private String str = "загадал";
    private String str1 = "за323";

    @Test
    public void programGuessTest() {
        assertTrue(RiddleNum.checkRiddle(str));
        assertFalse(RiddleNum.checkRiddle(str1));

    }
}
