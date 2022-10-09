package b03_Ido_Befektetes_statements;

public class Investment {
    private double cost;
    private int fund;
    private int interestRate;
    private boolean active;

    public Investment(int fund, int interestRate) {
        this.cost=0.3;
        this.active=true;
        this.fund = fund;
        this.interestRate = interestRate;
    }

    public int getFund() {
        return fund;
    }
    public double getYield(int days) {
        return (1.0*days/365)*(1.0*interestRate/100)*fund;
    }
    public double close(int days) {
        double moneyBack= active?((fund+this.getYield(days))*(100-cost)/100):0;
        active=false;
        return moneyBack;
    }
}
