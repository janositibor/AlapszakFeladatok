package j04_interfacedependencyinversion.deliveryprice;

public class LargeBox implements Box{
    @Override
    public Size getSize() {
        return Size.L;
    }

    @Override
    public int getPrice() {
        return 3000;
    }
}
