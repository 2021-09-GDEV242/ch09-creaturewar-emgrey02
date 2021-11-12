

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ElfTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ElfTest
{
    private Elf testElf;

    /**
     * Default constructor for test class ElfTest
     */
    public ElfTest()
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
        testElf = new Elf();
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
    public void testGetHealth()
    {
        assertEquals(22, testElf.getHealth());
        testElf.takeDamage(1);
        assertEquals(21, testElf.getHealth());
        testElf.takeDamage(21);
        assertEquals(0, testElf.getHealth());
        testElf.takeDamage(2);
        assertEquals(-2, testElf.getHealth());
    }

    @Test
    public void testIsAlive()
    {
        assertEquals(true, testElf.isAlive());
        testElf.takeDamage(20);
        assertEquals(false, testElf.isAlive());
        testElf.takeDamage(2);
        assertEquals(false, testElf.isAlive());
    }

    @Test
    public void testIsKnockedOut()
    {
        assertEquals(false, testElf.isKnockedOut());
        testElf.takeDamage(22);
        assertEquals(true, testElf.isKnockedOut());
        testElf.takeDamage(2);
        assertEquals(true, testElf.isKnockedOut());
    }

    @Test
    public void testTakeDamage()
    {
        testElf.takeDamage(5);
        assertEquals(15, testElf.getHealth());
        testElf.takeDamage(16);
        assertEquals(-1, testElf.getHealth());
    }
}





