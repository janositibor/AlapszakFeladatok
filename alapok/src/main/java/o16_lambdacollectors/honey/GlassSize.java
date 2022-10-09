package o16_lambdacollectors.honey;

public enum GlassSize {
    BIG(1.0), SMALL(0.5), TASTER_SIZE(0.05);

    private double weight;

    GlassSize(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}
