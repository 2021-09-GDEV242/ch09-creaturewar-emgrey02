

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class BalrogTest.
 *
 * @author  Emma Grey
 * @version 11.12.2021
 */
public class BalrogTest
{
    private Balrog balrog1;

    /**
     * Default constructor for test class BalrogTest
     */
    public BalrogTest()
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
        balrog1 = new Balrog(60, 180);
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
        assertEquals(true, balrog1.isAlive());
        balrog1.takeDamage(179);
        assertEquals(true, balrog1.isAlive());
        balrog1.takeDamage(1);
        assertEquals(false, balrog1.isAlive());
        balrog1.takeDamage(5);
        assertEquals(false, balrog1.isAlive());
    }
    
    @Test
    public void testIsKnockedOut()
    {
        assertEquals(false, balrog1.isKnockedOut());
        balrog1.takeDamage(179);
        assertEquals(false, balrog1.isKnockedOut());
        balrog1.takeDamage(1);
        assertEquals(true, balrog1.isKnockedOut());
        balrog1.takeDamage(5);
        assertEquals(true, balrog1.isKnockedOut());
    }

    @Test
    public void testTakeDamageGetHealth()
    {
        assertEquals(180, balrog1.getHealth());
        balrog1.takeDamage(5);
        assertEquals(175, balrog1.getHealth());
        balrog1.takeDamage(175);
        assertEquals(0, balrog1.getHealth());
        balrog1.takeDamage(5);
        assertEquals(-5, balrog1.getHealth());
    }
}
