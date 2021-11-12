
/**
 * Write a description of class Elf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Elf extends Creature
{
    private static final int MAX_ELF_HP = 25;
    private static final int MIN_ELF_HP = 8;
    private static final int MAX_ELF_STR = 18;
    private static final int MIN_ELF_STR = 5;
    
    /**
     * Constructor for objects of class Elf with no parameters (random values generated)
     */
    public Elf()
    {
        super(
            Randomizer.nextInt(MAX_ELF_STR-MIN_ELF_STR)+MIN_ELF_STR,
            Randomizer.nextInt(MAX_ELF_HP-MIN_ELF_HP)+MIN_ELF_HP
        );
    }

    /**
     * override Creature's damage method
     * Elf has 10% chance to do magical damage (2x damage returned)
     *
     * @return int amount of damage to cause to another creature
     */
    public int attack()
    {
        int baseDamage = super.attack();
        int random = Randomizer.nextInt(9);
        if (random == 0) {
            return baseDamage * 2;
        } else {
            return baseDamage;
        }
    }
}
