

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class TestSame.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestSame
{
    /**
     * Default constructor for test class TestSame
     */
    public TestSame()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void TestClocks()
    {
        ClockTime clockTim1 = new ClockTime(01, 01, 01);
        ClockTime clockTim2 = new ClockTime(01, 01, 01);
        assertEquals(true, clockTim1.equals(clockTim2));
    }

    @Test
    public void ClocksDifferent()
    {
        ClockTime clockTim1 = new ClockTime(01, 01, 01);
        ClockTime clockTim2 = new ClockTime(02, 02, 02);
        assertEquals(false, clockTim1.equals(clockTim2));
    }



    @Test
    public void testing24HourClock()
    {
        ClockTime clockTim1 = new ClockTime(23, 01, 01);
        clockTim1.setHour(23);
        clockTim1.setMinute(01);
        clockTim1.setSecond(01);
        assertEquals("23:01:01", clockTim1.toString());
    }
}




