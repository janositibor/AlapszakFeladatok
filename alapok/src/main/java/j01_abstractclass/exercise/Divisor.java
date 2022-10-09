package j01_abstractclass.exercise;

public class Divisor extends MathExercise{
    @Override
    public int getSolution(int a, int b) {
        if(b==0){
            throw new IllegalArgumentException("The divider have to differ from zero!");
        }
        return a/b;
    }
}
