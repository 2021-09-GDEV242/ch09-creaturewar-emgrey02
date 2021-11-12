
/**
 * Write a description of class Barlog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Barlog extends Demon
{
    private static final int MAX_BARLOG_HP = 200;
    private static final int MIN_BARLOG_HP = 80;
    private static final int MAX_BARLOG_STR = 100;
    private static final int MIN_BARLOG_STR = 50;

    /**
     * Constructor for objects of class Barlog
     */
    public Barlog() {
        super(
            Randomizer.nextInt(MAX_BARLOG_STR-MIN_BARLOG_STR)+MIN_BARLOG_STR,
            Randomizer.nextInt(MAX_BARLOG_HP-MIN_BARLOG_HP)+MIN_BARLOG_HP
        );
    }

    /**
     * Attacks twice each round
     */
    public int attack()
    {
        int baseDamage = super.attack();
        int doubleDamage = baseDamage + super.attack();
        return doubleDamage;
    }
}
