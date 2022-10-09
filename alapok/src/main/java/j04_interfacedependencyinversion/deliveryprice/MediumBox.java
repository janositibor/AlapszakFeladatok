package j04_interfacedependencyinversion.deliveryprice;

public class MediumBox implements Box{
    @Override
    public Size getSize() {
        return Size.M;
    }

    @Override
    public int getPrice() {
        return 2000;
    }
}
