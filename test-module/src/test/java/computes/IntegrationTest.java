// test-module\src\test\java\computes\IntegrationTest.java
package computes;

import org.example.IntegerLogicCompute;
import org.example.IntegerSimpleCompute;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegrationTest {

    private IntegerSimpleCompute simpleCompute;
    private IntegerLogicCompute logicCompute;

    @Before
    public void init() {
        simpleCompute = new IntegerSimpleCompute();
        logicCompute = new IntegerLogicCompute();
    }

    @Test
    public void simpleComputeTest() throws Throwable {
        assertEquals(7, simpleCompute.add(3, 4));
        assertEquals(4, simpleCompute.subtract(7, 3));
        assertEquals(12, simpleCompute.multiply(3, 4));
        assertEquals(3, simpleCompute.divide(12, 4));
    }

    @Test
    public void logicComputeTest() throws Throwable {
        assertEquals(8, logicCompute.increment(7));
        assertEquals(6, logicCompute.decrement(7));
        assertEquals(true, logicCompute.equals(125, 125));
        assertEquals(false, logicCompute.equals(123, 125));
        assertEquals(false, logicCompute.equals(123, 130));
        assertEquals(false, logicCompute.equals(133, 125));
        assertEquals(true, logicCompute.equals(140, 140));
        assertEquals(false, logicCompute.equals(140, 141));
    }
}