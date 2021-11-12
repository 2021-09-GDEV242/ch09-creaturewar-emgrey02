
/**
 * Write a description of class Cyberdemon here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
}