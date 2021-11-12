

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class AasimarTest.
 *
 * @author  Emma Grey
 * @version 11.12.2021
 */
public class AasimarTest
{
    private Aasimar aasimar1;

    /**
     * Default constructor for test class AasimarTest
     */
    public AasimarTest()
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
        aasimar1 = new Aasimar(20, 35);
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
        assertEquals(true, aasimar1.isAlive());
        aasimar1.takeDamage(34);
        assertEquals(true, aasimar1.isAlive());
        aasimar1.takeDamage(1);
        assertEquals(false, aasimar1.isAlive());
        aasimar1.takeDamage(10);
        assertEquals(false, aasimar1.isAlive());
    }

    @Test
    public void testIsKnockedOut()
    {
        assertEquals(false, aasimar1.isKnockedOut());
        aasimar1.takeDamage(34);
        assertEquals(false, aasimar1.isKnockedOut());
        aasimar1.takeDamage(1);
        assertEquals(true, aasimar1.isKnockedOut());
        aasimar1.takeDamage(5);
        assertEquals(true, aasimar1.isKnockedOut());
    }

    @Test
    public void testTakeDamageGetHealth()
    {
        assertEquals(35, aasimar1.getHealth());
        aasimar1.takeDamage(5);
        assertEquals(30, aasimar1.getHealth());
        aasimar1.takeDamage(30);
        assertEquals(0, aasimar1.getHealth());
        aasimar1.takeDamage(5);
        assertEquals(-5, aasimar1.getHealth());
    }
}
