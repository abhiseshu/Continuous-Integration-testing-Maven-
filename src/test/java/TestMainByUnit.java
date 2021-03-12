import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMainByUnit {

    Main main;

    @Before
    public void testSetup(){
        main = new Main();
    }

    @Test
    public void testAdd(){
        assertEquals(13,main.add(10,3));
    }

}
