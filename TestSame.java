

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
    private ClockTime clockTim1;
    private ClockTime clockTim2;

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
        clockTim1 = new ClockTime(12, 12, 12);
        clockTim2 = new ClockTime(12, 12, 12);
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
    public void ClocksSame()
    {
        assertEquals(true, clockTim1.equals(clockTim2));
    }

    @Test
    public void changeTime()
    {
        clockTim1.setHour(11);
        clockTim1.setMinute(00);
        clockTim1.setSecond(00);
        assertEquals("11:00:00", clockTim1.toString());
    }

    @Test
    public void Different()
    {
        clockTim1.setHour(11);
        clockTim1.setMinute(00);
        clockTim1.setSecond(00);
        clockTim1.equals(clockTim2);
    }

    @Test
    public void print24HourCLock()
    {
        clockTim1.setHour(23);
        clockTim1.setMinute(01);
        clockTim1.setSecond(01);
        assertEquals("23:01:01", clockTim1.toString());
    }

    @Test
    public void print12HourClock()
    {
        clockTim1.setHour(11);
        clockTim1.setMinute(01);
        clockTim1.setSecond(01);
        assertEquals("11:01:01", clockTim1.toString());
    }
}










