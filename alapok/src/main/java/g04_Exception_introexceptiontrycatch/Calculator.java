package g04_Exception_introexceptiontrycatch;

import java.util.Scanner;

public class Calculator {
    private Scanner scanner = new Scanner(System.in);
    private double firstOperand;
    private double secondOperand;
    private char operator;
    private double result;

    public static void main(String[] args) {
        Calculator calculator= new Calculator();

        calculator.getOperandFromUser(1,"What is the first operand?");
        calculator.getOperatorFromUser();
        calculator.getOperandFromUser(2,"What is the second operand?");
        calculator.calculateResult();
        System.out.println(calculator.getFirstOperand()+" "+ calculator.getOperator()+" "+ calculator.getSecondOperand()+" = "+calculator.getResult());

    }

    public void calculateResult(){
        switch (operator){
            case '+':
                result=firstOperand+secondOperand;
                break;
            case '-':
                result=firstOperand-secondOperand;
                break;
            case '*':
                result=firstOperand*secondOperand;
                break;
            case '/':
                try {
                    result = firstOperand / secondOperand;
                    break;
                }
                catch (ArithmeticException ignore) {
                    result=0.0;
                    System.out.println("Error! Division by zero!");
                }

        }
    }

    public void getOperatorFromUser() {
        String operatorInput;
        boolean goodOperator;

        do{
            System.out.println("Choose an operator(+,-,*,/):");
            operatorInput = scanner.nextLine();
            goodOperator=isGoodOperator(operatorInput.trim());
        }
        while(!goodOperator);
    }

    public void getOperandFromUser(int i,String s) {
        System.out.println(s);
        try {
            if(i==1) {
                firstOperand = Double.parseDouble(scanner.next());
            }
            else{
                secondOperand = Double.parseDouble(scanner.next());
            }
            scanner.nextLine();
        }
        catch (NumberFormatException ignore) {
            System.out.println("Invalid input");
            if(i==1) {
                firstOperand = 1.0;
            }
            else{
                secondOperand = 1.0;
            }
        }
    }

    public boolean isGoodOperator(String operatorInput) {
        String operators="+-/*";
        if(operatorInput.length()==1 && operators.contains(operatorInput)){
            operator=operatorInput.charAt(0);
            return true;
        }
        return false;
    }

    public double getFirstOperand() {
        return firstOperand;
    }

    public double getSecondOperand() {
        return secondOperand;
    }

    public char getOperator() {
        return operator;
    }

    public double getResult() {
        return result;
    }
}
