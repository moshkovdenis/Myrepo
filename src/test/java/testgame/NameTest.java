package testgame;

import static org.junit.Assert.*;
import org.junit.Test;

public class NameTest {
    private String name = "иван4";
    private String name1 = "Денис";
    private String name2 = "Петр петров";
    private String name3 = "";



    @Test
    public void checkNameTest() {
        assertFalse(Name.checkName(name));
        assertFalse(Name.checkName(name2));
        assertFalse(Name.checkName(name3));
        assertTrue(Name.checkName(name1));
    }

}
