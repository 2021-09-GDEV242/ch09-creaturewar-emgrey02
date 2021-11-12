/**
 * The Human class implements a wrapper for the base Creature class with the following additions
 * Implements a maximum/minimum strength for the creature type [30/10]
 * Implements a maximum/minimum hitpoint total for the creature type [18/5]
 * 
 * @author Bill Crosbie
 * @version 2020-10 v1.0
 */
public class Human extends Creature
{
    private static final int MAX_HUMAN_HP = 30;
    private static final int MIN_HUMAN_HP = 10;
    private static final int MAX_HUMAN_STR = 18;
    private static final int MIN_HUMAN_STR = 5;

    /**
     * Constructor for objects of class Human -
     * Note that the calling class does not need to know anything about the 
     * requirements of human minimum and maximum values
     * 
     * The instantiating class asks for a Human and the human class is responsible for
     * return a Human object with values in the appropriate range
     * 
     */
    public Human()
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super(
            Randomizer.nextInt(MAX_HUMAN_STR-MIN_HUMAN_STR)+MIN_HUMAN_STR,
            Randomizer.nextInt(MAX_HUMAN_HP-MIN_HUMAN_HP)+MIN_HUMAN_HP
        );
          
    }
    
    /**
     * Constructor for objects of class human that take parameters. After the object
     * is created, the values are tested for validity.
     */
    public Human(int str, int hp) {
        super(str, hp);
        testValues(str, hp);
    }
    
    /**
     * Tests the values passed into the constructor for Human objects. If invalid, 
     * an error message prints out.
     */
    private void testValues(int str, int hp) throws RuntimeException {
        if (str > MAX_HUMAN_STR || str < MIN_HUMAN_STR) {
            throw new RuntimeException("invalid strength value");
        }
        if (hp > MAX_HUMAN_HP || hp < MIN_HUMAN_STR) {
            throw new RuntimeException("invalid hp value");
        }
    }
    
    
    
    // attack() - not overridden because Humans generate basic damage
    // takeDamage(int) - not overridden, because Humans take all damage assigned to them

    
}
