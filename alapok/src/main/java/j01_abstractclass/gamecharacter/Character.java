package j01_abstractclass.gamecharacter;

import java.util.Random;

public abstract class Character {
    private Point position;
    private int hitPoint=100;
    private Random random=new Random(1984);

    public Character(Point position) {
        this.position = position;
    }

    public boolean isAlive(){
        return hitPoint>0;
    }
    protected int getActualPrimaryDamage(){
        return 1+random.nextInt(10);
    }
    private int getActualDefence(){
        return random.nextInt(6);
    }
    public void primaryAttack(Character enemy){
        hit(enemy, getActualPrimaryDamage());
    }
    protected void hit(Character enemy, int damage){
        if(enemy.getActualDefence()<damage){
            enemy.decreaseHitPoint(damage);
        }
    }
    private void decreaseHitPoint(int diff){
        hitPoint-=diff;
    }
    public abstract void secondaryAttack(Character enemy);

    public Point getPosition() {
        return position;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public Random getRandom() {
        return random;
    }
}
