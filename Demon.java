
/**
 * Write a description of class Demon here.
 *
 * @author Emma Grey
 * @version 11.6.2021
 */
public class Demon extends Creature
{
    public Demon(int str, int hp)
    {
        super(str, hp);
    }
    
    /**
     * override damage method, 5% chance to do magical damage
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