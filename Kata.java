/**
 * Created by Lukas on 2017-02-06.
 */
public class Kata {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker)  {
        if(firstAttacker == fighter2.name)
            attack(fighter2, fighter1);

        while(true){
            attack(fighter1, fighter2);
            if(fighter2.health <= 0)
                return fighter1.name;
            attack(fighter2, fighter1);
            if(fighter1.health <= 0)
                return fighter2.name;
        }
    }
    public static void attack(Fighter attacker, Fighter defender){
        defender.health -= attacker.damagePerAttack;
        if(defender.health <= 0)
            System.out.println(attacker.name + " attacks " + defender.name + "; " + defender.name + " now has " + defender.health + " health and is dead. " + attacker.name + " wins.");
        else
            System.out.println(attacker.name + " attacks " + defender.name + "; " + defender.name + " now has " + defender.health + " health.");
    }
}
