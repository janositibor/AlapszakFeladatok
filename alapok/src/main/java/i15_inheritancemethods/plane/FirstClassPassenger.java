package i15_inheritancemethods.plane;

public class FirstClassPassenger extends PriorityPassenger{
    final int extraCharge = 20000;

    public FirstClassPassenger(String name, int priceOfPlaneTicket, int percent) {
        super(name, priceOfPlaneTicket, percent);
    }

    public int getExtraCharge() {
        return extraCharge;
    }

    @Override
    public int getPriceOfPlaneTicket(){
        return super.getPriceOfPlaneTicket()+extraCharge;
    }
}
