

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ElfTest.
 *
 * @author  Emma Grey
 * @version 11.12.2021
 */
public class ElfTest
{
    private Elf elf1;


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
        elf1 = new Elf(15, 20);
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
        assertEquals(true, elf1.isAlive());
        elf1.takeDamage(19);
        assertEquals(true, elf1.isAlive());
        elf1.takeDamage(1);
        assertEquals(false, elf1.isAlive());
        elf1.takeDamage(10);
        assertEquals(false, elf1.isAlive());
    }

    @Test
    public void testIsKnockedOut()
    {
        assertEquals(false, elf1.isKnockedOut());
        elf1.takeDamage(19);
        assertEquals(false, elf1.isKnockedOut());
        elf1.takeDamage(1);
        assertEquals(true, elf1.isKnockedOut());
        elf1.takeDamage(5);
        assertEquals(true, elf1.isKnockedOut());
    }

    @Test
    public void testTakeDamageGetHealth()
    {
        assertEquals(20, elf1.getHealth());
        elf1.takeDamage(5);
        assertEquals(15, elf1.getHealth());
        elf1.takeDamage(15);
        assertEquals(0, elf1.getHealth());
        elf1.takeDamage(5);
        assertEquals(-5, elf1.getHealth());
    }
}








