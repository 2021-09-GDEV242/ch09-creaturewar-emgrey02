

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CyberdemonTest.
 *
 * @author  Emma Grey
 * @version 11.12.2021
 */
public class CyberdemonTest
{
    private Cyberdemon cyberdem1;

    /**
     * Default constructor for test class CyberdemonTest
     */
    public CyberdemonTest()
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
        cyberdem1 = new Cyberdemon(40, 100);
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
    public void testIsAlive()
    {
        assertEquals(true, cyberdem1.isAlive());
        cyberdem1.takeDamage(99);
        assertEquals(true, cyberdem1.isAlive());
        cyberdem1.takeDamage(1);
        assertEquals(false, cyberdem1.isAlive());
        cyberdem1.takeDamage(5);
        assertEquals(false, cyberdem1.isAlive());
    }
    
    @Test
    public void testIsKnockedOut()
    {
        assertEquals(false, cyberdem1.isKnockedOut());
        cyberdem1.takeDamage(99);
        assertEquals(false, cyberdem1.isKnockedOut());
        cyberdem1.takeDamage(1);
        assertEquals(true, cyberdem1.isKnockedOut());
        cyberdem1.takeDamage(5);
        assertEquals(true, cyberdem1.isKnockedOut());
    }

    @Test
    public void testTakeDamageGetHealth()
    {
        assertEquals(100, cyberdem1.getHealth());
        cyberdem1.takeDamage(5);
        assertEquals(95, cyberdem1.getHealth());
        cyberdem1.takeDamage(95);
        assertEquals(0, cyberdem1.getHealth());
        cyberdem1.takeDamage(5);
        assertEquals(-5, cyberdem1.getHealth());
    }
}

