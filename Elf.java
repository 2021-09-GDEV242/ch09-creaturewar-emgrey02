/**
 * The Elf is a kind of creature that has a 10% chance to attack with
 * additional magical damage and has specified max/min str [18/5]
 * and hp [25/8] values. This class inherits from the Creature class.
 *
 * @author Emma Grey
 * @version 11.11.21
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
     * Constructor for objects of class Elf that take parameters. After the object
     * is created, the values are tested for validity.
     */
    public Elf(int str, int hp) {
        super(str, hp);
        testValues(str, hp);
    }
    
    /**
     * Tests the values passed into the constructor for Human objects. If invalid, an exception
     * is thrown.
     */
    private void testValues(int str, int hp) throws RuntimeException {
        if (str > MAX_ELF_STR || str < MIN_ELF_STR) {
            throw new RuntimeException("invalid strength value");
        }
        if (hp > MAX_ELF_HP || hp < MIN_ELF_STR) {
            throw new RuntimeException("invalid hp value");
        }
    }

    /**
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
