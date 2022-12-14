package o12_lambdacomparator.cloud;

public enum PayPeriod {
    MONTHLY(1),ANNUAL(12),LIFETIME(60);

    private final int length;

    PayPeriod(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}
