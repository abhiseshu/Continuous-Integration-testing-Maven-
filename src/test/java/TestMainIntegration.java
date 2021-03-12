import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestMainIntegration {

    Main main;

    @Before
    public void testSetup(){
        main = new Main();
    }

    @Test
    public void TestChangeInResultwithAdd(){
        assertEquals(0,main.getResult());

        int addResultVal = main.add(13,-2);

        assertEquals(11,addResultVal);

        assertEquals(addResultVal,main.getResult());
    }
}
