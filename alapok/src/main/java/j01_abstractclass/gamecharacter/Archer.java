package j01_abstractclass.gamecharacter;

public class Archer extends Character{
    private int numberOfArrow;

    public Archer(Point position) {
        super(position);
        this.numberOfArrow = 100;
    }

    public int getNumberOfArrow() {
        return numberOfArrow;
    }

    public int getActualSecondaryDamage(){
        return 1+getRandom().nextInt(5);
    }
    private void shootingAnArrow(Character enemy){
        numberOfArrow--;
        hit(enemy,getActualSecondaryDamage());
    }

    @Override
    public void secondaryAttack(Character enemy) {
        shootingAnArrow(enemy);
    }
}
