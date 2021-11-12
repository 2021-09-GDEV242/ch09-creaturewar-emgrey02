

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class HumanTest.
 *
 * @author  Emma Grey
 * @version 11.12.2021
 */
public class HumanTest
{
    private Human human1;

    /**
     * Default constructor for test class HumanTest
     */
    public HumanTest()
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
        human1 = new Human(15, 30);
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
        assertEquals(true, human1.isAlive());
        human1.takeDamage(29);
        assertEquals(true, human1.isAlive());
        human1.takeDamage(1);
        assertEquals(false, human1.isAlive());
        human1.takeDamage(5);
        assertEquals(false, human1.isAlive());
    }

    @Test
    public void testIsKnockedOut()
    {
        assertEquals(false, human1.isKnockedOut());
        human1.takeDamage(29);
        assertEquals(false, human1.isKnockedOut());
        human1.takeDamage(1);
        assertEquals(true, human1.isKnockedOut());
        human1.takeDamage(5);
        assertEquals(true, human1.isKnockedOut());
    }

    @Test
    public void testTakeDamageGetHealth()
    {
        assertEquals(30, human1.getHealth());
        human1.takeDamage(5);
        assertEquals(25, human1.getHealth());
        human1.takeDamage(25);
        assertEquals(0, human1.getHealth());
        human1.takeDamage(5);
        assertEquals(-5, human1.getHealth());
    }
}



