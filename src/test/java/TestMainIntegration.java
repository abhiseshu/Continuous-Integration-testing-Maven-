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

    @Test
    public void TestChangeInResultwithdiv(){
        assertEquals(0,main.getResult());

        int addResultVal = main.div(13,1);

        assertEquals(13,addResultVal);

        assertEquals(addResultVal,main.getResult());
    }


    @Test
    public void TestChangeInResultwithSetResult(){

        assertEquals(0,main.getResult());

        int setResultVal = main.setResult(10);

        assertEquals(10,setResultVal);

        assertEquals(setResultVal,main.getResult());
    }
}
