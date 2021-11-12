
/**
 * Tiefling is a kind of demon that attacks with 1.5x strength
 * 20% of the time and has a specified max/min str [30/10] and
 * hp [40/20]. This class inherits from the Demon class.
 *
 * @author Emma Grey
 * @version 11.12.2021
 */
public class Tiefling extends Demon
{
    private static final int MAX_TIEF_HP = 40;
    private static final int MIN_TIEF_HP = 20;
    private static final int MAX_TIEF_STR = 30;
    private static final int MIN_TIEF_STR = 10;

    /**
     * Constructor for objects of class Tiefling
     */
    public Tiefling()
    {
        super(
            Randomizer.nextInt(MAX_TIEF_STR-MIN_TIEF_STR)+MIN_TIEF_STR,
            Randomizer.nextInt(MAX_TIEF_HP-MIN_TIEF_HP)+MIN_TIEF_HP
        );
    }
    
    /**
     * Constructor for objects of class Tiefling that take parameters. After the object
     * is created, the values are tested for validity.
     */
    public Tiefling(int str, int hp) {
        super(str, hp);
        testValues(str, hp);
    }
    
    /**
     * Tests the values passed into the constructor for Tiefling objects. If invalid, 
     * an exception is thrown.
     */
    private void testValues(int str, int hp) throws RuntimeException {
        if (str > MAX_TIEF_STR || str < MIN_TIEF_STR) {
            throw new RuntimeException("invalid strength value");
        }
        if (hp > MAX_TIEF_HP || hp < MIN_TIEF_STR) {
            throw new RuntimeException("invalid hp value");
        }
    }

    /**
     * The Tiefling attacks with +20 damage 10% of the time.
     *
     */
    public int attack()
    {
        int baseDamage = super.attack();
        int rand = Randomizer.nextInt(9);
        if (rand == 0) {
            return baseDamage + 20;
        } else {
            return baseDamage;
        }
    }
}
