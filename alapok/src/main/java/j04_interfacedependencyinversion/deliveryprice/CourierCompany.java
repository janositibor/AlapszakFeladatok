package j04_interfacedependencyinversion.deliveryprice;

public class CourierCompany {
    public static void main(String[] args) {
        Box boxS=new SmallBox();
        Box boxM=new MediumBox();
        Box boxL=new LargeBox();
        Box boxXL=new ExtraLargeBox();

        System.out.println(boxS.getSize()+": "+boxS.getPrice()+" Ft");
        System.out.println(boxM.getSize()+": "+boxM.getPrice()+" Ft");
        System.out.println(boxL.getSize()+": "+boxL.getPrice()+" Ft");
        System.out.println(boxXL.getSize()+": "+boxXL.getPrice()+" Ft");
    }

}
