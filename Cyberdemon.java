
/**
 * The Cyberdemon is a special kind of demon, with specified max/min str [40/20]
 * and hp [100/25] values. This class inherits from the Demon class, which
 * inherits from the Creature class.
 *
 * @author Emma Grey
 * @version 11.11.21
 */
public class Cyberdemon extends Demon
{
    private static final int MAX_CD_HP = 100;
    private static final int MIN_CD_HP = 25;
    private static final int MAX_CD_STR = 40;
    private static final int MIN_CD_STR = 20;
    
    /**
     * Constructor for objects of class Cyberdemon
     */
    public Cyberdemon()
    {
        super(
            Randomizer.nextInt(MAX_CD_STR-MIN_CD_STR)+MIN_CD_STR,
            Randomizer.nextInt(MAX_CD_HP-MIN_CD_HP)+MIN_CD_HP
        );
    }
    
    /**
     * Constructor for objects of class Cyberdemon that take parameters. After the object
     * is created, the values are tested for validity.
     */
    public Cyberdemon(int str, int hp) {
        super(str, hp);
        testValues(str, hp);
    }
    
    /**
     * Tests the values passed into the constructor for Cyberdemon objects. If invalid, 
     * an exception is thrown.
     */
    private void testValues(int str, int hp) throws RuntimeException {
        if (str > MAX_CD_STR || str < MIN_CD_STR) {
            throw new RuntimeException("invalid strength value");
        }
        if (hp > MAX_CD_HP || hp < MIN_CD_STR) {
            throw new RuntimeException("invalid hp value");
        }
    }
}