
/**
 * The Balrog is a special kind of demon that attacks twice in a single turn
 * and has specified max/min str [100/50] and hp [200/80] values. This class
 * inherits from the Demon class, which inherits from the Creature class. 
 *
 * @author Emma Grey
 * @version 11.11.21
 */
public class Balrog extends Demon
{
    private static final int MAX_BALROG_HP = 200;
    private static final int MIN_BALROG_HP = 80;
    private static final int MAX_BALROG_STR = 100;
    private static final int MIN_BALROG_STR = 50;

    /**
     * Constructor for objects of class Barlog
     */
    public Balrog() {
        super(
            Randomizer.nextInt(MAX_BALROG_STR-MIN_BALROG_STR)+MIN_BALROG_STR,
            Randomizer.nextInt(MAX_BALROG_HP-MIN_BALROG_HP)+MIN_BALROG_HP
        );
    }
    
    /**
     * Constructor for objects of class Balrog that take parameters. After the object
     * is created, the values are tested for validity.
     */
    public Balrog(int str, int hp) {
        super(str, hp);
        testValues(str, hp);
    }
    
    /**
     * Tests the values passed into the constructor for Balrog objects. If invalid, 
     * an exception is thrown.
     */
    private void testValues(int str, int hp) throws RuntimeException {
        if (str > MAX_BALROG_STR || str < MIN_BALROG_STR) {
            throw new RuntimeException("invalid strength value");
        }
        if (hp > MAX_BALROG_HP || hp < MIN_BALROG_STR) {
            throw new RuntimeException("invalid hp value");
        }
    }

    /**
     * Attacks twice each round!
     * 
     * @return the hp value of damage to cause to another creature
     */
    public int attack()
    {
        int baseDamage = super.attack();
        int doubleDamage = baseDamage + super.attack();
        return doubleDamage;
    }
}
