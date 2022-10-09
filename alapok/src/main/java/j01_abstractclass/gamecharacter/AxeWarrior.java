package j01_abstractclass.gamecharacter;

public class AxeWarrior extends Character{
    public AxeWarrior(Point position) {
        super(position);
    }
    public int getActualSecondaryDamage(){
        return 1+getRandom().nextInt(2*getActualPrimaryDamage());
    }

    @Override
    public void secondaryAttack(Character enemy) {
        if(getPosition().distance(enemy.getPosition())<2){
            hit(enemy,getActualSecondaryDamage());
        }
    }
}
