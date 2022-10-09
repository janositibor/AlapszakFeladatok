package o12_lambdacomparator.cloud;

public class CloudStorage implements Comparable<CloudStorage>{
    private String provider;
    private int space;
    private double price;
    private PayPeriod payperiod;

    public CloudStorage(String provider, int space, PayPeriod payperiod, double price) {
        this.provider = provider;
        this.space = space;
        this.price = price;
        this.payperiod = payperiod;
    }

    public CloudStorage(String provider, int space) {
        this.provider = provider;
        this.space = space;
        this.price=0;
        this.payperiod=null;
    }

    public long getAnnualPriceforATerra(){
        if(payperiod==null){
            return 0;
        }
        return Math.round(1.0*price*12*1000/(space*payperiod.getLength()));
    }
    public int getLength() {
        if(payperiod==null){
            return 0;
        }
        return payperiod.getLength();
    }

    @Override
    public int compareTo(CloudStorage o) {
        return (int)(this.getAnnualPriceforATerra()-o.getAnnualPriceforATerra());
    }

    @Override
    public String toString() {
        return "CloudStorage{" +
                "provider='" + provider + '\'' +
                ", space=" + space +
                ", price=" + price +
                ", payperiod=" + payperiod +
                "}\n";
    }

    public String getProvider() {
        return provider;
    }

    public int getSpace() {
        return space;
    }

    public double getPrice() {
        return price;
    }

    public PayPeriod getPeriod() {
        return payperiod;
    }


}
