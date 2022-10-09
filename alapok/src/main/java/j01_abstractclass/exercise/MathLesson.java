package j01_abstractclass.exercise;

public class MathLesson {
    public static void main(String[] args) {
        MathExercise add=new Adder();
        MathExercise sub=new Subtracter();
        MathExercise multipl=new Multiplier();
        MathExercise divide=new Divisor();
        System.out.println("12 + 3 = "+add.getSolution(12,3));
        System.out.println("12 - 3 = "+sub.getSolution(12,3));
        System.out.println("12 * 3 = "+multipl.getSolution(12,3));
        System.out.println("12 / 3 = "+divide.getSolution(12,3));
    }
}
