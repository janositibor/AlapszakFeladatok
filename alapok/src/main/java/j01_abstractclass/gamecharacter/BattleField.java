package j01_abstractclass.gamecharacter;

import java.util.Random;

public class BattleField {
    private int round;

    private boolean oneHit(Character attacker, Character defender){
        attacker.primaryAttack(defender);
        if(defender.isAlive()){
            attacker.secondaryAttack(defender);
        }
        return attacker.isAlive() && defender.isAlive();
    }

    public Character fight(Character one, Character other){
        int i=new Random().nextInt(2);
        boolean bothAlive;
        do{
            round++;
            if(i%2==0){
                bothAlive=oneHit(one,other);
            }
            else{
                bothAlive=oneHit(other,one);
            }
            i++;
        }
        while(bothAlive);
        return one.isAlive()?one:other;
    }

    public int getRound() {
        return round;
    }
}
