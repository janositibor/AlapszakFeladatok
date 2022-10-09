package g05_Exception_introexceptiontrycatchtrace;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator= new Calculator();

        try{
            calculator.getOperandFromUser(1,"What is the first operand?");
        }
        catch (NumberFormatException ignore) {
        System.out.println("Invalid input");
        calculator.setFirstOperand(1.0);
        }
        calculator.getOperatorFromUser();
        try{
            calculator.getOperandFromUser(2,"What is the second operand?");
        }
        catch (NumberFormatException ignore) {
            System.out.println("Invalid input");
            calculator.setSecondOperand(1.0);
        }
        try {
            calculator.calculateResult();
        }
        catch (ArithmeticException ignore) {
                calculator.setResult(0.0);
                System.out.println("Error! Division by zero!");
            }
        System.out.println(calculator.getFirstOperand()+" "+ calculator.getOperator()+" "+ calculator.getSecondOperand()+" = "+calculator.getResult());

    }

}
