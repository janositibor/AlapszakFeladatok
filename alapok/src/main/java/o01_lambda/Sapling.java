package o01_lambda;

public class Sapling {
    private String species;
    private int height;

    public Sapling(String species, int height) {
        this.species = species;
        this.height = height;
    }

    void cut(int maxHeight){
        setHeight(height>maxHeight?maxHeight:height);
    }

    boolean match(String species, int minHeight){
        return(this.species.equals(species) && height>minHeight);
    }

    public String getSpecies() {
        return species;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
