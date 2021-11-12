import java.util.ArrayList;
/**
 * Write a description of class BattleSimulator here.
 *
 * @author Emma Grey
 * @version 11.11.2021
 */
public class BattleSimulator
{
    private ArrayList<Creature> armyOne;
    private ArrayList<Creature> armyTwo;

    /**
     * Constructor for objects of class BattleSimulator
     */
    public BattleSimulator()
    {
        armyOne = new ArrayList<Creature>();
        armyTwo = new ArrayList<Creature>();
    }

    /**
     * Populate the armies with creatures by randomly generating amounts of certain races in each.
     * armyOne begins with 100 creatures (humans and elves), and armyTwo begins with 40 creatures
     * (humans, cyberdemons, balrogs)
     *
     */
    private void populateArmies()
    {
        //populate armyOne
        for (int i = 0; i < 100; i++) {
            int rand = Randomizer.nextInt(9) + 1;
            if (rand <= 6) {
                armyOne.add(new Human());
            } else {
                armyOne.add(new Elf());
            }
        }
        
        //populate armyTwo
        for (int i = 0; i < 40; i++) {
            int rand = Randomizer.nextInt(24) + 1;
            if (rand <= 18) {
                armyTwo.add(new Human());
            } else if (rand <= 24) {
                armyTwo.add(new Cyberdemon());
            } else {
                armyTwo.add(new Barlog());
            }
        }
    }
    
    /**
     * Simulate a battle between armyOne and armyTwo.
     * 
     * @return a String stating the winning army
     */
    private String battle()
    {
        //as long as both armies have creatures to fight...
        while (!armyOne.isEmpty() && !armyTwo.isEmpty()) {
            //individual battle
            while (armyOne.get(0).isAlive() && armyTwo.get(0).isAlive()) {
                armyOne.get(0).takeDamage(armyTwo.get(0).attack());
                armyTwo.get(0).takeDamage(armyOne.get(0).attack());
            }
            //one or both creatures are not Alive, remove from ArrayList if so
            if (armyOne.get(0).isKnockedOut()) {
                armyOne.remove(0);
            }
            if (armyTwo.get(0).isKnockedOut()) {
                armyTwo.remove(0);
            }
        }
        if (armyOne.isEmpty()) {
            return "army Two defeated army One!";
        } else {
            return "army One defeated army Two!";
        }
    }
    
    public void beginBattle() {
        populateArmies();
        System.out.println(battle());
    }
}
