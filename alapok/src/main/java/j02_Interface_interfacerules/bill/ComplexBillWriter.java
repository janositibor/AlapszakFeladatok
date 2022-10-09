package j02_Interface_interfacerules.bill;

import java.util.List;

public class ComplexBillWriter implements BillWriter{
    @Override
    public String writeBill(List<String> billItems) {
        String output="";
        Item item;
        for(String billItem:billItems){
            item=createItemFromString(billItem);
            output+=item.getReport2()+"\n";
        }
        return output;
    }
    private Item createItemFromString(String inputString){
        String[] separated=inputString.split(";");
        return new Item(separated[0], Integer.parseInt(separated[1]),Integer.parseInt(separated[2]));
    }
}
