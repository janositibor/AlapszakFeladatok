package g05_Exception_introexceptiontrycatchtrace;

import java.util.Scanner;

public class Calculator {
    private Scanner scanner = new Scanner(System.in);
    private double firstOperand;
    private double secondOperand;
    private char operator;
    private double result;


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
                result = firstOperand / secondOperand;
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
            if(i==1) {
                firstOperand = Double.parseDouble(scanner.next());
            }
            else{
                secondOperand = Double.parseDouble(scanner.next());
            }
            scanner.nextLine();

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

    public void setFirstOperand(double firstOperand) {
        this.firstOperand = firstOperand;
    }

    public void setSecondOperand(double secondOperand) {
        this.secondOperand = secondOperand;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
