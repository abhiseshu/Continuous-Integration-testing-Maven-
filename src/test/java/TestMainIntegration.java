import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

//Start of the Integration Test Script
public class TestMainIntegration {

    //Instances declaration
    Main main;

    //resusable code variables
    private int firstVar = 13;
    private int secondVar = -2;

    //Runs before every test case
    @Before
    public void testSetup() {
        main = new Main();
    }

    //Runs after every test case
    @After
    public void testTearDown() {
        main = null;
    }

//------------INTEGRATION TEST CASES-----------

    //This tests for change in the result value w.r.t the add fucntion
    @Test
    public void TestChangeInResultwithAdd(){

        verifyResultVal();

        int addResultVal = main.add(firstVar, secondVar);

        int expAddVal = 11;

        assertEquals(expAddVal, addResultVal);

        assertEquals(addResultVal, main.getResult());
    }

    //This tests for change in the result value w.r.t the div fucntion
    @Test
    public void TestChangeInResultwithdiv(){

        verifyResultVal();

        int addResultVal = main.div(firstVar, secondVar);

        int expAddVal = -6;

        assertEquals(-6, addResultVal);

        assertEquals(addResultVal, main.getResult());
    }

    //This tests for change in the result value w.r.t the set Result fucntion
    @Test
    public void TestChangeInResultwithSetResult(){

        verifyResultVal();

        int setResultVal = main.setResult(firstVar);

        assertEquals(firstVar, setResultVal);

        assertEquals(setResultVal, main.getResult());
    }

    //This tests for change in the result value w.r.t the sub fucntion
    @Test
    public void TestChangeInResultwithSub(){

        verifyResultVal();

        int subResultVal = main.sub(firstVar,secondVar);

        int expSubVal = 15;

        assertEquals(15, subResultVal);

        assertEquals(subResultVal, main.getResult());
    }

    //This tests for change in the result value w.r.t the Mul fucntion
    @Test
    public void TestChangeInResultwithMul(){

        verifyResultVal();

        int MulResultVal = main.mult(firstVar, secondVar);

        int expMultVal = -26;

        assertEquals(expMultVal, MulResultVal);

        assertEquals(MulResultVal, main.getResult());

    }

//---------Resuable code------------

    public void verifyResultVal(){
        int expVal = 0;
        assertEquals(0,main.getResult());
    }
}
