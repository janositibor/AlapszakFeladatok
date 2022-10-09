package o16_lambdacollectors.honey;

public enum HoneyType {
    MULTIFLORAL(1200), ACACIA(1800), LINDEN(1500);

    private int priceOfKilogramm;

    HoneyType(int priceOfKilogramm) {
        this.priceOfKilogramm = priceOfKilogramm;
    }

    public int getPriceOfKilogramm() {
        return priceOfKilogramm;
    }
}
