
/**
 * The Demon is a kind of creature, with a 5% chance to do magical damage
 * in an attack. This class inherits from the Creature class.
 *
 * @author Emma Grey
 * @version 11.6.2021
 */
public class Demon extends Creature
{
    /**
     * The constructor for a Demon object. Subclasses of Demon class will specify max
     * and min str and hp values. So, this constructor calls the superclass's (Creature)
     * constructor.
     */
    public Demon(int str, int hp)
    {
        super(str, hp);
    }
    
    /**
     * override damage method, 5% chance to increase attack by 50 hp.
     *
     * @return  int amount of damage to cause to another creature
     */
    public int attack()
    {
        int baseDamage = super.attack();
        int random = Randomizer.nextInt(19);
        if (random == 0) {
            return baseDamage + 50;
        } else {
            return baseDamage;
        }
    }
}