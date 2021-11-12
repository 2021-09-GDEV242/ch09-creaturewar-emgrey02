

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class TieflingTest.
 *
 * @author  Emma Grey
 * @version 11.12.2021
 */
public class TieflingTest
{
    private Tiefling tiefling1;

    /**
     * Default constructor for test class TieflingTest
     */
    public TieflingTest()
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
        tiefling1 = new Tiefling(30, 40);
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
        assertEquals(true, tiefling1.isAlive());
        tiefling1.takeDamage(39);
        assertEquals(true, tiefling1.isAlive());
        tiefling1.takeDamage(1);
        assertEquals(false, tiefling1.isAlive());
        tiefling1.takeDamage(10);
        assertEquals(false, tiefling1.isAlive());
    }

    @Test
    public void testIsKnockedOut()
    {
        assertEquals(false, tiefling1.isKnockedOut());
        tiefling1.takeDamage(39);
        assertEquals(false, tiefling1.isKnockedOut());
        tiefling1.takeDamage(1);
        assertEquals(true, tiefling1.isKnockedOut());
        tiefling1.takeDamage(5);
        assertEquals(true, tiefling1.isKnockedOut());
    }

    @Test
    public void testTakeDamageGetHealth()
    {
        assertEquals(40, tiefling1.getHealth());
        tiefling1.takeDamage(5);
        assertEquals(35, tiefling1.getHealth());
        tiefling1.takeDamage(35);
        assertEquals(0, tiefling1.getHealth());
        tiefling1.takeDamage(5);
        assertEquals(-5, tiefling1.getHealth());
    }
}
