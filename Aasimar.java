
/**
 * Aasimar is a kind of creature that attacks with +5 damage 20% of
 * the time, and has specified max/min str [25/10] and hp [50/20]
 * values. This class inherits from Creature.
 *
 * @author Emma Grey
 * @version 11.12.2021
 */
public class Aasimar extends Creature
{
    private static final int MAX_AASIMAR_HP = 38;
    private static final int MIN_AASIMAR_HP = 20;
    private static final int MAX_AASIMAR_STR = 25;
    private static final int MIN_AASIMAR_STR = 10;

    /**
     * Constructor for objects of class Aasimar
     */
    public Aasimar()
    {
        super(
            Randomizer.nextInt(MAX_AASIMAR_STR-MIN_AASIMAR_STR)+MIN_AASIMAR_STR,
            Randomizer.nextInt(MAX_AASIMAR_HP-MIN_AASIMAR_HP)+MIN_AASIMAR_HP
        );
    }
    
    /**
     * Constructor for objects of class Aasimar that take parameters. After the object
     * is created, the values are tested for validity.
     */
    public Aasimar(int str, int hp) {
        super(str, hp);
        testValues(str, hp);
    }
    
    /**
     * Tests the values passed into the constructor for Aasimar objects. If invalid, 
     * an exception is thrown.
     */
    private void testValues(int str, int hp) throws RuntimeException {
        if (str > MAX_AASIMAR_STR || str < MIN_AASIMAR_STR) {
            throw new RuntimeException("invalid strength value");
        }
        if (hp > MAX_AASIMAR_HP || hp < MIN_AASIMAR_STR) {
            throw new RuntimeException("invalid hp value");
        }
    }

    /**
     * Aasimar has a 20% chance of attacking with +5 damage.
     * 
     * @return the hp value of damage to cause to another creature
     */
    public int attack()
    {
        int baseDamage = super.attack();
        int rand = Randomizer.nextInt(4);
        if (rand == 0) {
            return baseDamage + 5;
        } else {
            return baseDamage;
        }
    }
}
